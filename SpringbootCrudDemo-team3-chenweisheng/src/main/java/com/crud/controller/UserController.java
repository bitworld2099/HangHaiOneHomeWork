package com.crud.controller;

import com.crud.service.UserService;
import com.crud.pojo.ResponseObject;
import com.crud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //新增用户信息
    @PostMapping
    public ResponseObject create(@RequestBody User user) {
        System.out.println(user);
        userService.save(user);
        return new ResponseObject("新增成功","200",null);
    }

    //查询所有用户
    @GetMapping
    public ResponseObject query() {
        List<User> userList = userService.findAll();
        return new ResponseObject("查询成功","200",userList);
    }

    //修改用户
    @PutMapping
    public ResponseObject update(@RequestBody User user){
        userService.update(user);
        return new ResponseObject("修改成功","200",null);
    }

    //删除用户
    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable Integer id){
        userService.deleteById(id);
        return new ResponseObject("删除成功","200",null);
    }
}
