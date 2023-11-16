package com.myxql.parser.model;

import java.util.*;

public final class Database extends Statement {
    private Optional<String> catalogName;
    private String databaseName;
    private Optional<String> location;
    private Optional<String> comment;
    private Map<String, String> properties;

    public Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public Optional<String> getLocation() {
        return this.location;
    }

    public Database(Optional<String> catalogName, String databaseName, Optional<String> location, Optional<String> comment, Map<String, String> properties) {
        super();
        this.catalogName = catalogName;
        this.databaseName = Objects.requireNonNull(databaseName, "databaseName is null");
        this.location = location;
        this.comment = comment;
        this.properties = properties;
    }

    public Database(Optional<String> catalogName, String databaseName, Optional<String> location) {
        this(catalogName, databaseName, location, Optional.empty(), new HashMap<>());
    }

    public Database(Optional<String> catalogName, String databaseName, Optional<String> location, Optional<String> comment) {
        this(catalogName, databaseName, location, comment, new HashMap<>());
    }

    public Database(Optional<String> catalogName, String databaseName, Map<String, String> properties) {
        this(catalogName, databaseName, Optional.empty(), Optional.empty(), properties);
    }


    public Database(Optional<String> catalogName, String databaseName) {
        this(catalogName, databaseName, Optional.empty());
    }

    public Database(String databaseName) {
        this(Optional.empty(), databaseName, Optional.empty());
    }

    @Override
    public String toString() {
        return "Database(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", location=" + this.location + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName != null ? this.databaseName.hashCode() : 0)) * 31;
        return var1 + (this.location.isPresent() ? this.location.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof Database) {
                Database var2 = (Database)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.location.equals(var2.location)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}