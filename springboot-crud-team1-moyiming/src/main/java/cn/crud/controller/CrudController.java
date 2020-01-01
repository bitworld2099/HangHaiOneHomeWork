package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
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

    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }

    //删除用户
    @DeleteMapping("/{id}")
    @ResponseBody
    public void delete(@PathVariable Integer id){
        biz.deleteById(id+1);
    }

    //修改用户
    @PutMapping
    @ResponseBody
    public void update(@RequestBody UserInfo userInfo){
        biz.update(userInfo);
    }

    //新增用户信息
    @PostMapping
    @ResponseBody
    public void create(@RequestBody UserInfo userInfo){
        biz.save(userInfo);
    }
}
