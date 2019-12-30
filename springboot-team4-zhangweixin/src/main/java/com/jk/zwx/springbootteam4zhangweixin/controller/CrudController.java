package com.jk.zwx.springbootteam4zhangweixin.controller;


import com.jk.zwx.springbootteam4zhangweixin.biz.UserInfoBiz;
import com.jk.zwx.springbootteam4zhangweixin.pojo.ResponseObject;
import com.jk.zwx.springbootteam4zhangweixin.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoBiz biz;
    //查询用户
    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }
    //修改用户
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        biz.update(userInfo);
        System.out.println(userInfo);
        return new ResponseObject("修改成功","200",null);
    }
    //新增用户
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        biz.save(userInfo);
        System.out.println(userInfo);
        return new ResponseObject("新增成功","200",null);
    }
    //删除用户
    @DeleteMapping
    public ResponseObject delete(@RequestBody Integer id){
        biz.delete(id);
        return new ResponseObject("删除成功","200",null);
    }
}
