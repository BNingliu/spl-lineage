package com.myxql.parser.presto.parser;

import com.myxql.parser.antlr4.ParseErrorListener;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.antlr4.ParsingOptions;
import com.myxql.parser.antlr4.UpperCaseCharStream;
import com.myxql.parser.model.StatementLineage;
import com.myxql.parser.presto.antlr4.SqlBaseLexer;
import com.myxql.parser.presto.antlr4.SqlBaseParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class PrestoFieldLineageParser {
    public StatementLineage parse(String command) {
        String trimCmd = StringUtils.trim(command);

        UpperCaseCharStream charStream = new UpperCaseCharStream(CharStreams.fromString(trimCmd));
        SqlBaseLexer lexer = new SqlBaseLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParseErrorListener());

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        ParsingOptions parsingOptions = new ParsingOptions();
        parser.addParseListener(new PrestoPostProcessor(Arrays.asList(parser.getRuleNames()), parsingOptions.getWarningConsumer()));
        parser.removeErrorListeners();
        parser.addErrorListener(new ParseErrorListener());
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

        PrestoFieldLineageAstBuilder sqlVisitor = new PrestoFieldLineageAstBuilder();
        sqlVisitor.setCommand(trimCmd);

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return (StatementLineage) sqlVisitor.visit(parser.singleStatement());
            }
            catch (ParseCancellationException ex) {
                tokenStream.seek(0); // rewind input stream
                parser.reset();

                // Try Again.
                parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                return (StatementLineage) sqlVisitor.visit(parser.statement());
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
