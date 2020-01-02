package com.cfs.controller;

import com.cfs.pojo.User;
import com.cfs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * @author Shinelon
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/user")
    public String add(@RequestBody User user){
        try{
            userService.add(user);
            return "OK";
        }catch (Exception e){
            return "FAIL";
        }

    }

    @GetMapping("/user/{id}")
    public Optional<User> findById(@PathVariable("id") Integer id){
       return userService.findById(id);
    }

    @PutMapping("/user")
    public User upda(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public String del(Integer id){
        try{
            userService.del(id);
            return "OK";
        }catch (Exception e){}
            return "FAIL";
    }

}
