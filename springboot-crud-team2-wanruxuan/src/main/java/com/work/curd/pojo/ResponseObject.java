package com.work.curd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor//无参构造注解
@AllArgsConstructor//所有参数注解
public class ResponseObject {
    private String msg;
    private String code;
    private  Object object;
}
