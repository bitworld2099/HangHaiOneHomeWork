package com.wsn.web.controller;

import com.wsn.biz.UserBiz;
import com.wsn.pojo.ResultObject;
import com.wsn.pojo.User;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {
    @Autowired
    private UserBiz biz;
    @GetMapping
    public List<User> findAll() {
        return biz.findAll();
    }
    @PostMapping
    public ResultObject create(@RequestBody User user){
        biz.save(user);
        System.out.println(user);
        return new ResultObject("添加成功","200",null);
    }
    @PutMapping
    public ResultObject update(@RequestBody User user){
        biz.save(user);
        System.out.println(user);
        return new ResultObject("更新成功","200",null);
    }
    @DeleteMapping
    public ResultObject delete(@RequestBody User user){
        biz.delete(user);
        System.out.println(user);
        return new ResultObject("删除成功","200",null);
    }
}

