package com.gzhmt.controller;

import com.gzhmt.pojo.UserInfo;
import com.gzhmt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//明确需要返回的是json数据才用
//相当于@Response和@Controller组合， 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html
@RequestMapping("/user")
public class CrudController {

    @Autowired
    private UserInfoService service;

    @GetMapping
    //查询所有数据
    public List<UserInfo> findAll(){
        System.out.println("查询...");
        return service.finaAll();
    }

    @DeleteMapping("/{id}")
    //删除一条数据
    public List<UserInfo> delete(@PathVariable Integer id){
        System.out.println("删除id为"+id+"数据");
        service.delete(id);
        return service.finaAll();
    }

    @PostMapping
    //新增
    public List<UserInfo> save(@RequestBody UserInfo user){
        System.out.println("新增："+user);
        service.save(user);
        return service.finaAll();
    }

    @PutMapping
    //修改
    public List<UserInfo> update(@RequestBody UserInfo user){
        System.out.println("修改id为"+user.getId()+"的用户");
        service.update(user);
        //service.saveAndFlush(user);
        return service.finaAll();

    }

}
