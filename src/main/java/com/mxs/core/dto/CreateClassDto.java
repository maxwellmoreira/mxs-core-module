package com.mxs.core.dto;

public class CreateClassDto {

    private String accessModifier;
    private String path;
    private String className;

    public CreateClassDto() {
    }

    public String getAccessModifier() {
        return accessModifier;
    }
    public String getPath() {
        return path;
    }
    public String getClassName() {
        return className;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public void setClassName(String className) {
        this.className = className;
    }
}
