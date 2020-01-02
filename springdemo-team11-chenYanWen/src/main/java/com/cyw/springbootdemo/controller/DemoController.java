package com.cyw.springbootdemo.controller;


import com.cyw.springbootdemo.entities.User;
import com.cyw.springbootdemo.cyw.UserInfoGgh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {

    //注入业务层
    @Autowired
    private UserInfoGgh userinfoggh;

    @GetMapping("/user")
    public List<User> findAll() {
        return userinfoggh.findAll();
    }

    @PostMapping("/user")
    public String add(@RequestBody User user){
        try{
            userinfoggh.add(user);
            return "OK";
        }catch (Exception e){
            return "FAIL";
        }

    }

    @GetMapping("/user/{id}")
    public Optional<User> findById(@PathVariable("id") Integer id){
        return userinfoggh.findById(id);
    }

    @PutMapping("/user")
    public User upda(@RequestBody User user){

        return userinfoggh.updateUser(user);
    }

    @DeleteMapping("/user")
    public String del(Integer id){
        try{
            userinfoggh.del(id);
            return "OK";
        }catch (Exception e){}
        return "FAIL";
    }


}