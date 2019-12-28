package com.gzmtu.mxdc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author MXDC
 * @date 2019/12/24
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    /** 成功状态码 */
    SUCCESS(1,"成功"),
    /** 失败状态码 */
    FAIL(-1,"失败"),

    /** 服务器未知异常 */
    SERVER_EXCEPTION(0,"服务不可用"),

    /** 参数错误：1001-1999  */
    PARAM_IS_INVALID(1001,"参数无效");

    /** 状态码 */
    private Integer code;
    /** 消息 */
    private String message;
}
