package com.work.curd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="users")
public class UserInfo {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private Integer id;
    @NotEmpty
    private String username;
    @NotEmpty
    private String email;
    @NotEmpty
    private String sex;
    @NotEmpty
    private String province;
    private String hobby;
}
