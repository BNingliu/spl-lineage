package com.myxql.parser.model;

import java.util.Optional;

public final class AlterColumnAction {
    private Optional<String> columName;
    private Optional<String> newColumName;
    private Optional<String> dataType;
    private Optional<String> comment;
    private Optional<String> position;
    private Optional<String> afterCol;
    private Optional<String> setOrDrop;
    private Optional<String> defaultExpression;
    private boolean dropDefault;

    public Optional<String> getColumName() {
        return this.columName;
    }

    public void setColumName(Optional<String> var1) {
        this.columName = var1;
    }

    public Optional<String> getNewColumName() {
        return this.newColumName;
    }

    public void setNewColumName(Optional<String> var1) {
        this.newColumName = var1;
    }

    public Optional<String> getDataType() {
        return this.dataType;
    }

    public void setDataType(Optional<String> var1) {
        this.dataType = var1;
    }

    public Optional<String> getComment() {
        return this.comment;
    }

    public void setComment(Optional<String> var1) {
        this.comment = var1;
    }

    public Optional<String> getPosition() {
        return this.position;
    }

    public void setPosition(Optional<String> var1) {
        this.position = var1;
    }

    public Optional<String> getAfterCol() {
        return this.afterCol;
    }

    public void setAfterCol(Optional<String> var1) {
        this.afterCol = var1;
    }

    public Optional<String> getSetOrDrop() {
        return this.setOrDrop;
    }

    public void setSetOrDrop(Optional<String> var1) {
        this.setOrDrop = var1;
    }

    public Optional<String> getDefaultExpression() {
        return this.defaultExpression;
    }

    public void setDefaultExpression(Optional<String> var1) {
        this.defaultExpression = var1;
    }

    public final boolean getDropDefault() {
        return this.dropDefault;
    }

    public final void setDropDefault(boolean var1) {
        this.dropDefault = var1;
    }

    public AlterColumnAction(Optional<String> columName, Optional<String> newColumName, Optional<String> dataType, Optional<String> comment, Optional<String> position, Optional<String> afterCol, Optional<String> setOrDrop, Optional<String> defaultExpression, boolean dropDefault) {
        this.columName = columName;
        this.newColumName = newColumName;
        this.dataType = dataType;
        this.comment = comment;
        this.position = position;
        this.afterCol = afterCol;
        this.setOrDrop = setOrDrop;
        this.defaultExpression = defaultExpression;
        this.dropDefault = dropDefault;
    }


    public AlterColumnAction(Optional<String> columName, Optional<String> newColumName) {
        this(columName, newColumName, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
                Optional.empty(), false);
    }

    public AlterColumnAction() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
                Optional.empty(), false);
    }

    @Override
    public String toString() {
        return "AlterColumnAction(columName=" + this.columName + ", newColumName=" + this.newColumName + ", dataType=" + this.dataType + ", comment=" + this.comment + ", position=" + this.position + ", afterCol=" + this.afterCol + ", setOrDrop=" + this.setOrDrop + ", defaultExpression=" + this.defaultExpression + ", dropDefault=" + this.dropDefault + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.columName.isPresent() ? this.columName.hashCode() : 0) * 31;
        var1 = (var1 + (this.newColumName.isPresent() ? this.newColumName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.dataType.isPresent() ? this.dataType.hashCode() : 0)) * 31;
        var1 = (var1 + (this.comment.isPresent() ? this.comment.hashCode() : 0)) * 31;
        var1 = (var1 + (this.position.isPresent() ? this.position.hashCode() : 0)) * 31;
        var1 = (var1 + (this.afterCol.isPresent() ? this.afterCol.hashCode() : 0)) * 31;
        var1 = (var1 + (this.setOrDrop.isPresent() ? this.setOrDrop.hashCode() : 0)) * 31;
        var1 = (var1 + (this.defaultExpression.isPresent() ? this.defaultExpression.hashCode() : 0)) * 31;

        return var1 + (this.dropDefault ? 1 : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that != null) {
            return false;
        }
        if (this != that) {
            if (that instanceof AlterColumnAction) {
                AlterColumnAction var2 = (AlterColumnAction)that;
                if (this.columName.equals(var2.columName) && this.newColumName.equals(var2.newColumName) && this.dataType.equals(var2.dataType)
                        && this.comment.equals(var2.comment) && this.position.equals(var2.position) && this.afterCol.equals(var2.afterCol)
                        && this.setOrDrop.equals(var2.setOrDrop) && this.defaultExpression.equals(var2.defaultExpression)
                        && this.dropDefault == var2.dropDefault) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}