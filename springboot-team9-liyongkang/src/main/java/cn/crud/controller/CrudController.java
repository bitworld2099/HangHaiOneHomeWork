package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoBiz biz;
    @PutMapping("/1")
    public UserInfo update(@RequestBody UserInfo userInfo){
        biz.update(userInfo);
        // return new ResponseObject("修改成功","200",userInfo);
        return  userInfo;
    }
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id){
        System.out.println("1234484545454");
        biz.delete(id);
        // return new ResponseObject("删除成功","200",id);
        return id;
    }
    @PostMapping
    public UserInfo insert(@RequestBody UserInfo userInfo) {
        biz.insert(userInfo);
        //return new ResponseObject("新增成功","200",userInfo);
        return userInfo;
    }
    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }

}

