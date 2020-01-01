package com.jk.controller;

import com.jk.biz.UserInfoBiz;
import com.jk.pojo.ResponseObject;
import com.jk.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author Zvoy
 * @Date 2019/12/26 17:23
 * @Version 1.0
 */
@RestController
public class CrudController {

    @Autowired
    private UserInfoBiz userService;

    @GetMapping("/user")
    public List<UserInfo> findAll() {
        return userService.findAll();
    }

    @PostMapping("/user")
    public String add(@RequestBody UserInfo user) {
        try {
            userService.add(user);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }

    }

    @GetMapping("/user/{id}")
    public Optional<UserInfo> findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @PutMapping("/user")
    public UserInfo upda(@RequestBody UserInfo user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public String del(Integer id) {
        try {
            userService.del(id);
            return "OK";
        } catch (Exception e) {
        }
        return "FAIL";
    }
}
