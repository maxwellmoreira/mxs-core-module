package com.mxs.core.type;

import static com.mxs.core.type.ExceptionType.INFRASTRUCTURE;

public enum InfrastructureExceptionType {

    INFRA_0001("INFRA-0001","An internal server error has occurred.", INFRASTRUCTURE),
    INFRA_0002("INFRA-0002","An error occurred while reading or writing the file.", INFRASTRUCTURE);
    InfrastructureExceptionType(String code, String message, ExceptionType exceptionType) {
        this.code = code;
        this.message = message;
        this.exceptionType = exceptionType;
    }

    private String code;
    private String message;
    private ExceptionType exceptionType;

    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
    public ExceptionType getExceptionType() { return exceptionType; }
}
