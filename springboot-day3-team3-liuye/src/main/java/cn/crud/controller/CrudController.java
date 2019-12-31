package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoBiz biz;

    //查询所有用户信息
    @GetMapping
    public ResponseObject query(){
        List<UserInfo> list = biz.findAll();
        return new ResponseObject("查询成功","200",list);
    }

    //新增用户信息
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        biz.save(userInfo);
        return new ResponseObject("新增成功","200",null);
    }

    //删除用户信息
    @DeleteMapping
    public ResponseObject del(@RequestBody int id){
        biz.del(id);
        return new ResponseObject("删除成功","200",null);
    }

    //修改用户信息
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        biz.save(userInfo);
        return new ResponseObject("新增成功","200",null);
    }
}
