package com.myxql.parser.job.parser;

import com.myxql.parser.antlr4.ParseErrorListener;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.antlr4.UpperCaseCharStream;
import com.myxql.parser.job.antlr4.MyxqlJobParser;
import com.myxql.parser.model.StatementLineage;
import com.myxql.parser.job.antlr4.MyxqlJobLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class MyJobParser {
    public static List<StatementLineage> parse(String command) {
        String trimCmd = StringUtils.trim(command);

        UpperCaseCharStream charStream = new UpperCaseCharStream(CharStreams.fromString(trimCmd));
        MyxqlJobLexer lexer = new MyxqlJobLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParseErrorListener());

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        MyxqlJobParser parser = new MyxqlJobParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParseErrorListener());
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

        MyJobAstBuilder astBuilder = new MyJobAstBuilder();
        astBuilder.setCommand(command);
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                astBuilder.visit(parser.jobCommonds());
                return astBuilder.getTableDatas();
            }
            catch (ParseCancellationException ex) {
                tokenStream.seek(0); // rewind input stream
                parser.reset();

                // Try Again.
                parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                astBuilder.visit(parser.jobCommonds());
                return astBuilder.getTableDatas();
            }
        } catch (ParseException e) {
            if(StringUtils.isNotBlank(e.getCommand())) {
                throw e;
            } else {
                throw e.withCommand(command);
            }
        }
    }

}
