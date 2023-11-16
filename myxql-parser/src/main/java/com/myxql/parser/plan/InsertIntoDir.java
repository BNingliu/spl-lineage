package com.myxql.parser.plan;

import com.myxql.parser.antlr4.Origin;
import java.util.Optional;

public class InsertIntoDir extends LogicalPlan {
    private Boolean isLocal;
    private String storageFormat;
    private Optional<String> provider;
    private LogicalPlan query;
    private Boolean overwrite = true;

    private Boolean resolved = false;

    public InsertIntoDir(Origin location, Boolean isLocal, String storageFormat, Optional<String> provider, LogicalPlan child, Boolean overwrite) {
        super(Optional.of(location));
        this.isLocal = isLocal;
        this.storageFormat = storageFormat;
        this.provider = provider;
        this.query = child;
        this.overwrite = overwrite;
    }



}
