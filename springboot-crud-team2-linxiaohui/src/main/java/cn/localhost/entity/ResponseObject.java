package cn.localhost.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : forlxh
 * @date : 21:28 2019/12/31
 */
@Data
@AllArgsConstructor
public class ResponseObject {

    private String message;
    private String code;
    private Object obj;
}
