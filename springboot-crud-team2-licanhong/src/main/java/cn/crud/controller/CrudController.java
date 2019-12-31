package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoBiz biz;

    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }

    @PostMapping
    public UserInfo addUser(@RequestBody UserInfo userInfo){ return biz.addUser(userInfo);}


    @DeleteMapping("/{id:\\d+}")
    public void deleteUser(@PathVariable Integer id){
        biz.deleteUser(id);
    }

    @PutMapping
    public UserInfo updateUser(@RequestBody UserInfo userInfo){
        return biz.updateUser(userInfo);
    }
}
