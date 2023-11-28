package com.myxql.parser.clickhouse.parser;

import com.myxql.parser.antlr4.ParsingWarning;
import com.myxql.parser.clickhouse.antlr4.CksqlBaseListener;

import java.util.List;
import java.util.function.Consumer;

import static java.util.Objects.requireNonNull;

public class ClickHouseSQLPostProcessor extends CksqlBaseListener {
    private final List<String> ruleNames;
    private final Consumer<ParsingWarning> warningConsumer;

    public ClickHouseSQLPostProcessor(List<String> ruleNames, Consumer<ParsingWarning> warningConsumer) {
        this.ruleNames = ruleNames;
        this.warningConsumer = requireNonNull(warningConsumer, "warningConsumer is null");
    }

}