package cn.localhost.web.controller;

import cn.localhost.entity.ResponseObject;
import cn.localhost.service.UserInfoService;
import cn.localhost.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author : forlxh
 * @date : 20:35 2019/12/31
 */

@RestController
@RequestMapping("/user")
public class CrudController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping
    public List<UserInfo> findAll(){
        return userInfoService.findAll();


    }

    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable Integer id){
        userInfoService.deleteUserById(id);
        return new  ResponseObject("删除成功","200",null);
    }

    @PutMapping
    public ResponseObject update(@RequestBody UserInfo userInfo){
        userInfoService.update(userInfo);
        return new ResponseObject("修改成功","200",null);
    }

    @PostMapping
    public ResponseObject create(@RequestBody UserInfo form){
        userInfoService.saveUser(form);
        return new ResponseObject("新增成功","200",null);
    }

}