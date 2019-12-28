package com.gzmtu.mxdc.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author MXDC
 * @date 2019/12/27
 **/
@Data
@Entity
@Table(name = "user")
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

    @Column(unique = true,nullable = false)
    @NotBlank(message = "用户名不为空")
    private String username;

    @Column
    private String sex;

    @Column
    @Email(message = "邮箱格式不正确")
    @NotBlank(message = "邮箱不为空")
    private String email;

    @Column
    private String province;

    @Column
    private String hobby;

    @Column(nullable = false,insertable = false, updatable = false,columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private Date createTime;

    @Column(nullable = false,insertable = false, updatable = false,columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date lastModifyTime;

}
