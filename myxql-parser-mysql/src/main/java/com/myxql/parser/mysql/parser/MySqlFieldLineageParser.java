package com.myxql.parser.mysql.parser;

import com.myxql.parser.antlr4.*;
import com.myxql.parser.model.StatementLineage;
import com.myxql.parser.mysql.antlr4.MySqlLexer;
import com.myxql.parser.mysql.antlr4.MySqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class MySqlFieldLineageParser {
    public StatementLineage parse(String command) {
        String trimCmd = StringUtils.trim(command);

        UpperCaseCharStream charStream = new UpperCaseCharStream(CharStreams.fromString(trimCmd));
        MySqlLexer lexer = new MySqlLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParseErrorListener());

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        MySqlParser parser = new MySqlParser(tokenStream);
        ParsingOptions parsingOptions = new ParsingOptions();
        parser.addParseListener(new MySqlPostProcessor(Arrays.asList(parser.getRuleNames()), parsingOptions.getWarningConsumer()));
        parser.removeErrorListeners();
        parser.addErrorListener(new ParseErrorListener());
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

        MySqlFieldLineageAstBuilder sqlVisitor = new MySqlFieldLineageAstBuilder();
        sqlVisitor.setCommand(trimCmd);

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return (StatementLineage) sqlVisitor.visit(parser.sqlStatement());
            }
            catch (ParseCancellationException ex) {
                tokenStream.seek(0); // rewind input stream
                parser.reset();

                // Try Again.
                parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                return (StatementLineage) sqlVisitor.visit(parser.sqlStatement());
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
