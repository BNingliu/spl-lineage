package com.myxql.parser.antlr4;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

public class ParsingWarning {
    // Avoid extending ParsingException due to cost of filling in a stacktrace on creation
    private final int lineNumber;
    private final int columnNumber;
    private final String warning;

    public ParsingWarning(String warning, int line, int columnNumber)
    {
        this.warning = requireNonNull(warning, "warning is null");
        this.lineNumber = line;
        this.columnNumber = columnNumber;
    }

    public ParsingWarning(String message)
    {
        this(message, 1, 1);
    }

    public int getLineNumber()
    {
        return lineNumber;
    }

    public int getColumnNumber()
    {
        return columnNumber;
    }

    public String getWarning()
    {
        return warning;
    }

    public String getMessage()
    {
        return format("lineNumber %s:%s: %s", lineNumber, columnNumber, getWarning());
    }
}
