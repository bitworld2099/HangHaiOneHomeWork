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
    //查询用户
    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }

    //新增用户信息
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        biz.add(userInfo);
        return new ResponseObject("新增成功","200",null);
    }

    //修改用户
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        biz.update(userInfo);
        return new ResponseObject("修改成功","200",null);
    }

    //删除用户
    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable Integer id){
        biz.delete(id);
        return new ResponseObject("删除成功","200",null);
    }
}
