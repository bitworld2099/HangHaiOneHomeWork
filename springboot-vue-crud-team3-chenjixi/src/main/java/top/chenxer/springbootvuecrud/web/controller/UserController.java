package top.chenxer.springbootvuecrud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.chenxer.springbootvuecrud.biz.UserInfoBiz;
import top.chenxer.springbootvuecrud.entity.UserInfo;

import java.util.List;

/**
 * @author xer97
 * @date 2019/12/25 10:56
 */
@RestController
@RequestMapping("/user")
public class UserController {


    private UserInfoBiz userInfoBiz;

    @GetMapping("/")
    public List<UserInfo> findAll(){
        return userInfoBiz.listUserInfo();
    }

    @GetMapping("/{id}")
    public UserInfo get(@PathVariable("id") String id){
        return userInfoBiz.getUserInfo(Integer.valueOf(id));
    }

    @PostMapping("/")
    public UserInfo save(UserInfo userInfo){
        return userInfoBiz.saveUserInfo(userInfo);
    }

    @PutMapping("/")
    public UserInfo update(UserInfo userInfo){
        return userInfoBiz.saveUserInfo(userInfo);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        return userInfoBiz.deleteUserInfo(Integer.valueOf(id));
    }

    @Autowired
    public void setUserInfoBiz(UserInfoBiz userInfoBiz) {
        this.userInfoBiz = userInfoBiz;
    }
}
