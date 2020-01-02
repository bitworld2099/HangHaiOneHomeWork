package cn.crud.controller;

import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.User;
import cn.crud.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping
    public List<User> findAllUser(){
        return userServiceImpl.findAllUser();
    }

    @PostMapping("/create")
    public ResponseObject createUser(@RequestBody User user){
        userServiceImpl.create(user);
        return new ResponseObject("新增成功","200",null);
    }

    @PostMapping("edit")
    public ResponseObject editUser(@RequestBody User user){
        userServiceImpl.edit(user);
        return new ResponseObject("修改成功","200",null);
    }

    @PostMapping("/delete")
    public ResponseObject DeleteUserById(@RequestBody Integer id){
        System.out.println(id);
        userServiceImpl.deleteUserById(id);
        return new ResponseObject("删除成功","200",null);
    }
}
