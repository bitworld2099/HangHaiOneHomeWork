package com.crud.controller;

import com.crud.pojo.User;
import com.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/addUser")
    public String addUser(User user){
        String msg = userService.addUser(user);
        return msg;
    }

    @PutMapping("/updateUser")
    public String updateUser(User user){
        String msg = userService.updateUser(user);
        return msg;
    }
    @DeleteMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }
}
