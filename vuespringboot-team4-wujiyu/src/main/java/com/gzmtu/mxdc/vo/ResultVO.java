package com.gzmtu.mxdc.vo;


import com.gzmtu.mxdc.enums.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author MXDC
 * @date 2019/12/24
 **/
@Data
@NoArgsConstructor
public class ResultVO implements Serializable {

    private Integer code;
    private String message;
    private Object data;

    public ResultVO(ResultCode resultCode, Object data){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }
    public ResultVO(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public ResultVO(Integer code, String message){
        this.code = code;
        this.message = message;
    }
    public static ResultVO success(){
        ResultVO result = new ResultVO(ResultCode.SUCCESS);
        return result;
    }

    public static ResultVO success(Object data){
        ResultVO result = new ResultVO(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static ResultVO failure(){
        ResultVO result = new ResultVO(ResultCode.FAIL);
        return result;
    }

    public static ResultVO failure(String msg){
        ResultVO result = new ResultVO(-1,msg);
        return result;
    }
}
