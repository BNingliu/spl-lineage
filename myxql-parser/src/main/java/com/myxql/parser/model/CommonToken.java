package com.myxql.parser.model;

public final class CommonToken {
    private final int start;
    private final int stop;

    public final int getStart() {
        return this.start;
    }

    public final int getStop() {
        return this.stop;
    }

    public CommonToken(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public String toString() {
        return "CommonToken(start=" + this.start + ", stop=" + this.stop + ")";
    }

    @Override
    public int hashCode() {
        return this.start * 31 + this.stop;
    }

    @Override
    public boolean equals(Object that) {
        if (this != that) {
            if (that instanceof CommonToken) {
                CommonToken var2 = (CommonToken)that;
                if (this.start == var2.start && this.stop == var2.stop) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}