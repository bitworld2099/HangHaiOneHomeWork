package top.chenxer.springbootvuecrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author xer97
 * @date 2019/12/25 10:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_user_info")
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
