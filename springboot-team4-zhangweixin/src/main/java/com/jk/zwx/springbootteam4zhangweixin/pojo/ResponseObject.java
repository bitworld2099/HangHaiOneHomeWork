package com.jk.zwx.springbootteam4zhangweixin.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseObject {
    private String msg;
    private String code;
    private Object object;
}
