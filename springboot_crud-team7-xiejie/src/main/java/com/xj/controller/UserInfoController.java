package com.xj.controller;

import com.xj.pojo.UserInfo;
import com.xj.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoServiceImpl;

    @GetMapping
    public List<UserInfo> findAllUserInfo(){
        List<UserInfo> list = new ArrayList<>();
        list = userInfoServiceImpl.findAll();
        return list;
    }

    @PostMapping("/insert")
    public UserInfo insertUserInfo(@RequestBody UserInfo userInfo){
        UserInfo u =  userInfoServiceImpl.insUserInfo(userInfo);
        return u;
    }

    @PutMapping("/update")
    public UserInfo updateUserInfo(@RequestBody UserInfo userInfo){
        UserInfo u = userInfoServiceImpl.updUserInfo(userInfo);
        return u;
    }

    @DeleteMapping("/{id}")
    public void deleteUserInfo(@PathVariable Integer id){
        userInfoServiceImpl.delUserInfo(id);
    }
}
