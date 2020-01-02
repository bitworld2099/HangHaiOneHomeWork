package com.adidi.controller;

import com.adidi.Service.UserInfoService;
import com.adidi.pojo.ResponseObject;
import com.adidi.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    //查询用户
    @GetMapping
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }
    //新增用户
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        userInfoService.save(userInfo);
        return new ResponseObject("新增成功","200",null);
    }
    //修改用户
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        userInfoService.update(userInfo);
        return new ResponseObject("修改成功","200",null);
    }
    //删除用户
    @DeleteMapping
    public ResponseObject delete(@RequestBody Integer id){
        userInfoService.delete(id);
        return new ResponseObject("删除成功","200",null);
    }
}
