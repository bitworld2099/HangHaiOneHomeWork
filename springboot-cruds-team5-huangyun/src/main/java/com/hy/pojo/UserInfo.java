package com.hy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @创建人 hy
 * @创建时间 2019/12/27
 * @实体类，对应数据库
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tb_userinfo")
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
