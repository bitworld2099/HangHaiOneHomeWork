package com.gzmtu.mxdc.exception;

import com.gzmtu.mxdc.enums.ResultCode;
import lombok.Getter;

/**
 * @author MXDC
 * @date 2019/12/24
 **/
@Getter
public class CustomerException extends RuntimeException {

    private Integer code;
    private String message;

    public CustomerException(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
}
