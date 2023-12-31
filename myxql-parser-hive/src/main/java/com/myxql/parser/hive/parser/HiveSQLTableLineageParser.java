package com.myxql.parser.hive.parser;

import com.myxql.parser.antlr4.ParseErrorListener;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.antlr4.ParsingOptions;
import com.myxql.parser.antlr4.UpperCaseCharStream;
import com.myxql.parser.hive.antlr4.HplsqlLexer;
import com.myxql.parser.hive.antlr4.HplsqlParser;
import com.myxql.parser.model.StatementLineage;
import lombok.Data;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

@Data
public class HiveSQLTableLineageParser {
    private Integer dbType;
    private Integer relationship;

    public HiveSQLTableLineageParser(Integer dbType,Integer relationship) {
        this.dbType = dbType;
        this.relationship=relationship;
    }

    public StatementLineage parse(String command) {
        String trimCmd = StringUtils.trim(command);

        UpperCaseCharStream charStream = new UpperCaseCharStream(CharStreams.fromString(trimCmd));
        HplsqlLexer lexer = new HplsqlLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParseErrorListener());

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokenStream);
        ParsingOptions parsingOptions = new ParsingOptions();
        parser.addParseListener(new HiveSQLPostProcessor(Arrays.asList(parser.getRuleNames()), parsingOptions.getWarningConsumer()));
        parser.removeErrorListeners();
        parser.addErrorListener(new ParseErrorListener());
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

        HiveSQLTableLineageAstBuilder sqlVisitor = new HiveSQLTableLineageAstBuilder(dbType);
        sqlVisitor.setCommand(trimCmd);

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return sqlVisitor.visit(parser.stmt());
            } catch (ParseCancellationException ex) {
                tokenStream.seek(0); // rewind input stream
                parser.reset();

                // Try Again.
                parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                return sqlVisitor.visit(parser.stmt());
            }
        } catch (ParseException ex) {
            if(StringUtils.isNotBlank(ex.getCommand())) {
                throw ex;
            } else {
                throw ex.withCommand(trimCmd);
            }
        }
    }

}
