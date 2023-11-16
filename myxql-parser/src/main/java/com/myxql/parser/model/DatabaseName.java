package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public class DatabaseName {
    private Optional<String> catalogName;
    private String databaseName;

    public DatabaseName(Optional<String> catalogName, String databaseName) {
        this.catalogName = catalogName;
        this.databaseName = Objects.requireNonNull(databaseName, "databaseName is null");
    }

    public Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    @Override
    public String toString() {
        return "DatabaseName(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        return var1 + (this.databaseName != null ? this.databaseName.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof DatabaseName) {
                DatabaseName var2 = (DatabaseName)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }

}
