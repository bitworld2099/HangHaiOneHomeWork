package com.jk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author Zvoy
 * @Date 2019/12/26 16:54
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tbl_userinfo")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private String sex;
    private String province;
    private String hobby;
}
