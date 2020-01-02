package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoBiz biz;

    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }


}
