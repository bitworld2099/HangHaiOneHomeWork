package com.gzmtu.mxdc.exception.handle;

import com.gzmtu.mxdc.enums.ResultCode;
import com.gzmtu.mxdc.exception.CustomerException;
import com.gzmtu.mxdc.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ValidationException;

/**
 * @author MXDC
 * @date 2019/12/24
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(CustomerException.class)
    @ResponseBody
    public ResultVO customerException(CustomerException e){
        return new ResultVO(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResultVO bindException(BindException e)
    {
        log.info(e.getBindingResult().getFieldError().getDefaultMessage());
        return ResultVO.failure(e.getBindingResult().getFieldError().getDefaultMessage());
    }

    /** *
     * 处理请求参数格式错误 @RequestBody上validate失败后抛出的异常是MethodArgumentNotValidException异常。
     * 方法参数校验
     * */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResultVO handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.info(e.getBindingResult().getFieldError().getField());
        return new ResultVO(-1, e.getBindingResult().getFieldError().getDefaultMessage()); }

//  校验注解使用错误，如@Email不能使用在Integer上
    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    public ResultVO validatedException(ValidationException e){

        log.info(e.getMessage());
        return ResultVO.failure();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVO exceptionHandler(Exception e){
        log.error(e.getMessage());
        return new ResultVO(ResultCode.SERVER_EXCEPTION);
    }

}

