package cn.crud.controller;

import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.UserInfo;
import cn.crud.server.UserInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoServer asd;
    //修改用户
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        asd.save2(userInfo);
        System.out.println(userInfo);
        return new ResponseObject("修改成功","200",null);
    }

    //查询所有用户
    @GetMapping
    public ResponseObject findAll(){
        List<UserInfo> list=asd.findAll();
        return new ResponseObject("查询成功","200",list);
    }
    //新增用户
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        asd.save(userInfo);
        System.out.println(userInfo);
        return new ResponseObject("新增成功","200",null);
    }
    //删除用户
    @DeleteMapping
    public ResponseObject delete(@RequestBody Integer id){
        asd.delete(id);
        return new ResponseObject("删除成功","200",null);
    }
}
