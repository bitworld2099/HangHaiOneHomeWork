package edu.learn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author super lollipop
 * @date 19-12-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_userinfo")
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
