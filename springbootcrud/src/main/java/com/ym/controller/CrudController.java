package com.ym.controller;

import com.ym.biz.UserInfoBiz;
import com.ym.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {
    @Autowired
    private UserInfoBiz biz;
    @GetMapping
    public List<User> findAll(){
        System.out.println("findAll");
        return biz.findAll();
    }
    @PostMapping
    public User add(@RequestBody User user){
        System.out.println("add");
        biz.addUser(user);
        return user;
    }
    @DeleteMapping
    public void deleteUser(User user){
        System.out.println("deleteUser:"+user.getId());
        biz.deleteUser(user);
    }
    @PutMapping
    public User UpdateUser(@RequestBody User user){
        biz.updateUser(user);
        return user;
    }

}
