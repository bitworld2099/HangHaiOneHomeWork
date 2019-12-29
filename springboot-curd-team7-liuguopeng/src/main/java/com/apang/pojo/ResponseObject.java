package com.apang.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseObject {
    private String msg;
    private String code;
    private String Object;

    public ResponseObject(String msg, String code, String object) {
        this.msg = msg;
        this.code = code;
        Object = object;
    }

    public ResponseObject() {
    }
}
