package com.gzmtu.mxdc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>
 * 后台管理员表
 * </p>
 *
 * @author mxdc
 * @since 2019-11-30
 */
@Data
@Entity
@Table(name = "admin")
public class AdminDO  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String icon;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 备注信息
     */
    private String note;

    /**
     * 最后登录时间
     */
    private Date loginTime;

    /**
     * 帐号是否锁定：0->未锁定；1->锁定
     */
    private boolean locked;

    /**
     * 帐号是否可用：0->禁用；1->启用
     */
    private boolean enabled;

    /**
     * 创建时间
     */
    @Column(nullable = false,insertable = false, updatable = false,columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(nullable = false,insertable = false, updatable = false,columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date modifiedTime;


}
