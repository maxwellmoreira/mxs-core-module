package com.mxs.core.exception;

import com.mxs.core.type.ExceptionType;

public class UseCaseException {

    private String code;
    private String description;
    private String detail;
    private ExceptionType exceptionType;
    private String timestamp;

    public UseCaseException() { }

    public String getCode() { return code; }
    public String getDescription() {
        return description;
    }
    public ExceptionType getExceptionType() {
        return exceptionType;
    }
    public String getDetail() { return detail; }
    public String getTimestamp() {
        return timestamp;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setExceptionType(ExceptionType exceptionType) { this.exceptionType = exceptionType; }
    public void setDetail(String detail) { this.detail = detail; }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
