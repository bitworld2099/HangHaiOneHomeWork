package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoBiz biz;

    @GetMapping("/findAllUser")
    public List<UserInfo> findAll(){
        return biz.findAll();
    }

    /**新增用户信息*/
    @PostMapping("addUser")
    public String addUser(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        biz.addUser(userInfo);
        return "新增成功";
    }

    /**修改用户信息*/
    @PostMapping("changeUser")
    public String changeUser(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        biz.changeUser(userInfo);
        return "修改成功";
    }

    /**删除用户信息*/
    @GetMapping("deleteUser")
    public String deleteUser(String uid){
        System.out.println(uid);
        Integer tempId = Integer.valueOf(uid);
        biz.deleteUser(tempId);
        return "修改成功";
    }
}
