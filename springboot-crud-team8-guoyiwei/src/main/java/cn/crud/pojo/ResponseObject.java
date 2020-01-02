package cn.crud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
//@AllArgsConstructor
public class ResponseObject {
     private String code;
     private String massge;
     private  Object obj;

     public ResponseObject( String code, String massge, Object o) {
          this.code= code;
          this.obj=o;
          this.massge=massge;
     }
}
