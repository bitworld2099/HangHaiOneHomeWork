package com.Exception;

public class ErrorRuntimeException extends RuntimeException {

    private Integer code;

    public ErrorRuntimeException(Integer code,String message) {
        super(message);
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}