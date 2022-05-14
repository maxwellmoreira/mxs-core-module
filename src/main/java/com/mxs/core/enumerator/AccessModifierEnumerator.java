package com.mxs.core.enumerator;

public enum AccessModifierEnumerator {

    PRIVATE("private"),
    PROTECTED("protected"),
    PUBLIC("public");

    private AccessModifierEnumerator(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }
}
