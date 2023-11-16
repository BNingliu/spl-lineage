package com.myxql.parser.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class JobData extends Statement {
    private String resourceName;
    private String className;
    private Optional<List> params;

    public String getResourceName() {
        return this.resourceName;
    }

    public String getClassName() {
        return this.className;
    }

    public Optional<List> getParams() {
        return this.params;
    }

    public JobData(String resourceName, String className, Optional<List> params) {
        super();
        this.resourceName = Objects.requireNonNull(resourceName, "resourceName is null");
        this.className = Objects.requireNonNull(className, "className is null");
        this.params = params;
    }

    @Override
    public String toString() {
        return "JobData(resourceName=" + this.resourceName + ", className=" + this.className + ", params=" + this.params + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.resourceName != null ? this.resourceName.hashCode() : 0) * 31;
        var1 = (var1 + (this.className != null ? this.className.hashCode() : 0)) * 31;
        return var1 + (this.params.isPresent() ? this.params.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof JobData) {
                JobData var2 = (JobData)that;
                if (this.resourceName.equals(var2) && this.className.equals(var2.className)
                        && this.params.equals(var2.params)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }

}
