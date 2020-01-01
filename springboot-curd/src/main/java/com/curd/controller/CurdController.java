package com.curd.controller;

import com.curd.bzi.Impl.UserBziImpl;
import com.curd.pojo.ResponseObject;
import com.curd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CurdController {
    @Autowired
    private UserBziImpl userInfoBzi;
    @GetMapping
    public List<User> findAll(){

        return userInfoBzi.findAll();
    }

    @PostMapping
    public ResponseObject create(@RequestBody User user){
        System.out.println(user);
        userInfoBzi.save(user);
        return new ResponseObject("新增成功","200",null);
    }
    @DeleteMapping
    public  ResponseObject del(@RequestBody Integer id){
        System.out.println(id);
        User user=new User();
        user.setId(id);
        userInfoBzi.del(user);
        return new ResponseObject("del成功","200",null);
    }
    @PutMapping
    public ResponseObject put(@RequestBody User user){
        userInfoBzi.update(user);
        return new ResponseObject("put成功","200",null);
    }
}
