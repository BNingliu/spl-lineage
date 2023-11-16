package com.myxql.parser.spark.parser;

import com.myxql.parser.spark.antlr4.SqlBaseParser;
import com.myxql.parser.spark.antlr4.SqlBaseParserBaseListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;

public class SparkSQLPostProcessor extends SqlBaseParserBaseListener {

    /** Remove the back ticks from an Identifier. */
    @Override
    public void exitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token)ctx.getChild(0).getPayload();

        CommonToken commonToken = new CommonToken(
                new org.antlr.v4.runtime.misc.Pair(token.getTokenSource(), token.getInputStream()),
                SqlBaseParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 1,
                token.getStopIndex() - 1);

        commonToken.setText(commonToken.getText().replace("``", "`"));
        parent.addChild(commonToken);
    }

    /** Treat non-reserved keywords as Identifiers. */
    @Override
    public void exitNonReserved(SqlBaseParser.NonReservedContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token)ctx.getChild(0).getPayload();

        parent.addChild(new CommonToken(new Pair(token.getTokenSource(), token.getInputStream()),
                SqlBaseParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 0,
                token.getStopIndex() - 0));
    }
}