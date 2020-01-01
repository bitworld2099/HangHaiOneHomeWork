package com.pojo;

import com.group.UpdateGroup;
import com.service.UserInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.sql.Update;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_userinfo")
public class UserInfo {
    @Id
    @NotNull(message="修改时id不能为空",groups = {UpdateGroup.class})
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message="姓名不能为空")
    private String username;
    @Email(message="邮箱格式不一样")//,输入格式
    private String email;
    private String sex;
    private String province;
    private String hobby;
}
