package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
    @Autowired
    private UserInfoBiz biz;
    //新增用户信息
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        biz.save(userInfo);
        return  new ResponseObject("操作成功","200",null);
    }
    //修改用户信息
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        biz.save(userInfo);
        return  new ResponseObject("操作成功","200",null);
    }

    //删除用户
    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable Integer id){
        biz.delete(id);
        return  new ResponseObject("操作成功","200",null);
    }



}
