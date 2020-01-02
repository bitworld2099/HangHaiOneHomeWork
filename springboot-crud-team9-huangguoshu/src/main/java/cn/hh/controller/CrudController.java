package cn.hh.controller;

import cn.hh.pojo.UserInfo;
import cn.hh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    @Autowired
    private UserInfoService service;

    @GetMapping
    //查询所有数据
    public List<UserInfo> findAll(){
        return service.finaAll();
    }

    @DeleteMapping("/{id}")
    //删除一条数据
    public List<UserInfo> delete(@PathVariable Integer id){
        service.delete(id);
        return service.finaAll();
    }

    @PostMapping
    //新增
    public List<UserInfo> save(@RequestBody UserInfo user){
        service.save(user);
        return service.finaAll();
    }

    @PutMapping
    //修改
    public List<UserInfo> update(@RequestBody UserInfo user){
        service.update(user);
        return service.finaAll();

    }
    @GetMapping("hello")
    public String sayHello(){
        return "hello!";
    }

}
