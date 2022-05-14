package com.mxs.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

import static com.mxs.core.type.InfrastructureExceptionType.INFRA_0001;
import static com.mxs.core.type.InfrastructureExceptionType.INFRA_0002;

@ControllerAdvice
public class UseCaseExceptionHandler {

    @ExceptionHandler(CustomGenericException.class)
    public ResponseEntity<UseCaseException> customGenericExceptionHandler(CustomGenericException customGenericException) {

        UseCaseException useCaseException = new UseCaseException();
        useCaseException.setCode(INFRA_0001.getCode());
        useCaseException.setDescription(INFRA_0001.getMessage());
        useCaseException.setDetail(customGenericException.getMessage());
        useCaseException.setExceptionType(INFRA_0001.getExceptionType());
        useCaseException.setTimestamp(LocalDateTime.now().toString());

        return new ResponseEntity<>(useCaseException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IoCustomException.class)
    public ResponseEntity<UseCaseException> iOCustomExceptionHandler(IoCustomException ioCustomException) {

        UseCaseException useCaseException = new UseCaseException();
        useCaseException.setCode(INFRA_0002.getCode());
        useCaseException.setDescription(INFRA_0002.getMessage());
        useCaseException.setDetail(ioCustomException.getMessage());
        useCaseException.setExceptionType(INFRA_0002.getExceptionType());
        useCaseException.setTimestamp(LocalDateTime.now().toString());

        return new ResponseEntity<>(useCaseException, HttpStatus.FORBIDDEN);
    }
}
