package com.jk.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author Zvoy
 * @Date 2019/12/27 17:29
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject {
    private String msg;
    private String code;
    private String object;
}
