package cn.hh.web.controller;

import cn.hh.pojo.ResponseObject;
import cn.hh.pojo.UserInfo;
import cn.hh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    //查询所有用户信息
    @GetMapping
    public ResponseObject query(){
        List<UserInfo> list = userInfoService.findAll();
        return new ResponseObject("查询成功","200",list);
    }

    //新增用户信息
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        userInfoService.save(userInfo);
        return new ResponseObject("新增成功","200",null);
    }
}
