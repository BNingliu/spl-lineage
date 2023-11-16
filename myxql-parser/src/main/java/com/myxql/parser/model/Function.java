package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public final class Function extends Statement {
    private String name;
    private boolean temporary;
    private Optional<String> className;
    private Optional<String> file;

    public String getName() {
        return this.name;
    }

    public boolean getTemporary() {
        return this.temporary;
    }

    public void setTemporary(boolean var1) {
        this.temporary = var1;
    }

    public Optional<String> getClassName() {
        return this.className;
    }

    public Optional<String> getFile() {
        return this.file;
    }

    public Function(String name, boolean temporary, Optional<String> className, Optional<String> file) {
        super();
        this.name = Objects.requireNonNull(name, "name is null");
        this.temporary = temporary;
        this.className = className;
        this.file = file;
    }

    public Function(String name) {
        this(name, false, Optional.empty(), Optional.empty());
    }

    @Override
    public String toString() {
        return "Function(name=" + this.name + ", temporary=" + this.temporary + ", className=" + this.className + ", file=" + this.file + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.name != null ? this.name.hashCode() : 0) * 31;
        int var10001 = this.temporary ? 1 : 0;
        var1 = (var1 + var10001) * 31;
        var1 = (var1 + (this.className.isPresent() ? this.className.hashCode() : 0)) * 31;
        return var1 + (this.file.isPresent() ? this.file.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof Function) {
                Function var2 = (Function)that;
                if (this.name.equals(var2.name) && this.temporary == var2.temporary
                        && this.className.equals(var2.className) && this.file.equals(var2.file)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}