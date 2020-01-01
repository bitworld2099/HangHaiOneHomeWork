package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoBiz userInfoBiz;
@GetMapping
    public ResponseObject query(){
        List<UserInfo>list =userInfoBiz.findAll();
        return new ResponseObject("查询成功","200",list);
    }
    @PostMapping
     public ResponseObject create(@RequestBody UserInfo userInfo){
        userInfoBiz.save(userInfo);
         return new ResponseObject("新增成功","200",null);
    }
    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
    userInfoBiz.update(userInfo);
        return new ResponseObject("修改成功","200",null) ;
    }
    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable Integer id) {
        userInfoBiz.deleteById(id);
        return new ResponseObject("删除成功", "200", null);
    }

}
