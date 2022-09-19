package com.testvagrant.yamlreader.tests.models;

import java.util.List;

public class MessageField {
    public String name;
    public String type;
    public int length;
    public String comment;
    public List<VariableField> variableFields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<VariableField> getVariableFields() {
        return variableFields;
    }

    public void setVariableFields(List<VariableField> variableFields) {
        this.variableFields = variableFields;
    }
}


