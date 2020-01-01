package com.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@RestControllerAdvice
public class BadRequestExceptionHandler {
    /**
     * 该方法需要返回一个错误信息
     * 参数Exception e:会将产生异常对象注入到方法中
     */
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public Error errorHandler(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        StringBuilder errorMsg = new StringBuilder();

        for (ObjectError error : result.getAllErrors()) {
            errorMsg.append(error.getDefaultMessage()).append(",");
        }
        errorMsg.delete(errorMsg.length() - 1, errorMsg.length());
        System.out.println(errorMsg.toString());
        System.out.println(ex.getBindingResult());
        return new Error(500,errorMsg.toString());
    }

//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public Error handle(Exception e){
//        // 判断异常是自定义异常
//       // if (e instanceof ErrorRuntimeException){
//            ErrorRuntimeException errorRuntimeException = (ErrorRuntimeException) e;
//            return new Error(errorRuntimeException.getCode(), errorRuntimeException.getMessage());
//        //} else {
//
//        //    return ResultUtil.fail(-1, "e.getMessage()");
//        //}
//
//    }



}