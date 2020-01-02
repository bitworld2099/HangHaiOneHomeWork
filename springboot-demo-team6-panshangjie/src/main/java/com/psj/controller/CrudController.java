package com.psj.controller;

import com.psj.pojo.ResponseObject;
import com.psj.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class CrudController {
    @Autowired
    private UserInfoServer asd;
    //修改
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        asd.save2(userInfo);
        System.out.println(userInfo);
        return new ResponseObject("修改成功","200",null);
    }

    //查询
    @GetMapping
    public ResponseObject findAll(){
        List<UserInfo> list=asd.findAll();
        return new ResponseObject("查询成功","200",list);
    }
    //增加
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        asd.save(userInfo);
        System.out.println(userInfo);
        return new ResponseObject("新增成功","200",null);
    }
    //删除
    @DeleteMapping
    public ResponseObject delete(@RequestBody Integer id){
        asd.delete(id);
        return new ResponseObject("删除成功","200",null);
    }
}
