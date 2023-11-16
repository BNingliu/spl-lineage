package com.myxql.parser.postgresql.parser;

import com.myxql.parser.antlr4.ParsingWarning;
import com.myxql.parser.postgresql.antlr4.PostgreSQLParserBaseListener;

import java.util.List;
import java.util.function.Consumer;

import static java.util.Objects.requireNonNull;

public class PostgreSQLPostProcessor extends PostgreSQLParserBaseListener {
    private final List<String> ruleNames;
    private final Consumer<ParsingWarning> warningConsumer;

    public PostgreSQLPostProcessor(List<String> ruleNames, Consumer<ParsingWarning> warningConsumer) {
        this.ruleNames = ruleNames;
        this.warningConsumer = requireNonNull(warningConsumer, "warningConsumer is null");
    }
/*
        @Override
        public void exitUnquotedIdentifier(HplsqlParser.UnquotedIdentifierContext context) {
            String identifier = context.IDENTIFIER().getText();
            for (IdentifierSymbol identifierSymbol : EnumSet.complementOf(allowedIdentifierSymbols)) {
                char symbol = identifierSymbol.getSymbol();
                if (identifier.indexOf(symbol) >= 0) {
                    throw new ParsingException("identifiers must not contain '" + identifierSymbol.getSymbol() + "'", null, context.IDENTIFIER().getSymbol().getLine(), context.IDENTIFIER().getSymbol().getCharPositionInLine());
                }
            }
        }

        @Override
        public void exitBackQuotedIdentifier(HplsqlParser.BackQuotedIdentifierContext context) {
            Token token = context.BACKQUOTED_IDENTIFIER().getSymbol();
            throw new ParsingException(
                    "backquoted identifiers are not supported; use double quotes to quote identifiers",
                    null,
                    token.getLine(),
                    token.getCharPositionInLine());
        }

        @Override
        public void exitDigitIdentifier(HplsqlParser.DigitIdentifierContext context) {
            Token token = context.DIGIT_IDENTIFIER().getSymbol();
            throw new ParsingException(
                    "identifiers must not start with a digit; surround the identifier with double quotes",
                    null,
                    token.getLine(),
                    token.getCharPositionInLine());
        }

        @Override
        public void exitNonReserved(HplsqlParser.Non_reserved_wordsContext context) {
            // we can't modify the tree during rule enter/exit event handling unless we're dealing with a terminal.
            // Otherwise, ANTLR gets confused an fires spurious notifications.
            if (!(context.getChild(0) instanceof TerminalNode)) {
                int rule = ((ParserRuleContext) context.getChild(0)).getRuleIndex();
                throw new AssertionError("nonReserved can only contain tokens. Found nested rule: " + ruleNames.get(rule));
            }

            // replace nonReserved words with IDENT tokens
            context.getParent().removeLastChild();

            Token token = (Token) context.getChild(0).getPayload();
            if (RESERVED_WORDS_WARNING.contains(token.getText().toUpperCase())) {
                warningConsumer.accept(new ParsingWarning(
                        format("%s should be a reserved word, please use double quote (\"%s\"). This will be made a reserved word in future release.", token.getText(), token.getText()),
                        token.getLine(),
                        token.getCharPositionInLine()));
            }

            context.getParent().addChild(new CommonToken(
                    new Pair<>(token.getTokenSource(), token.getInputStream()),
                    HplsqlLexer.L_ID,
                    token.getChannel(),
                    token.getStartIndex(),
                    token.getStopIndex()));
        }
 */

}
