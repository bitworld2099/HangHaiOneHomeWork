package edu.learn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author super lollipop
 * @date 19-12-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject {
    private String msg;
    private String code;
    private Object object;
}
