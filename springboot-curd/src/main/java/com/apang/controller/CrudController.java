package com.apang.controller;

import com.apang.biz.UserInfoBiz;
import com.apang.pojo.ResponseObject;
import com.apang.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {
    @Autowired
    private UserInfoBiz biz;

    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }

    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        biz.save(userInfo);
        return new ResponseObject("新增成功","200",null);
    }

    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        biz.save(userInfo);
        return new ResponseObject("更新成功","200",null);
    }

    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable Integer id){
        biz.delete(id);
        return new ResponseObject("删除成功","200",null);
    }
}
