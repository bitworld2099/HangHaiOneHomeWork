package com.work.curd.controller;

import com.work.curd.pojo.ResponseObject;
import com.work.curd.pojo.UserInfo;
import com.work.curd.service.UserService;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {
    //注入业务实现层
    @Autowired
    private UserService ser;
    @GetMapping
    public List<UserInfo> findAll(){
    return ser.query();
    }
    @PostMapping
    public ResponseObject add(@RequestBody @Valid UserInfo userInfo,BindingResult errors)
    {

        if(errors.hasErrors())
        return new ResponseObject("添加失败","400",null);
        else{
            ser.add(userInfo);
            return new ResponseObject("添加成功","200",null);
        }

    }
    @PutMapping
    public ResponseObject update(@RequestBody @Valid UserInfo userInfo,BindingResult errors)
    {

        if(errors.hasErrors())
            return new ResponseObject("更新失败","400",null);
        else {
            ser.modify(userInfo);
            return new ResponseObject("更新成功", "200", null);
        }
    }
    @DeleteMapping
    public ResponseObject delete(@RequestBody @Valid UserInfo userInfo, BindingResult errors){

        if(errors.hasErrors())
        return new ResponseObject("删除出错","400",null);
        else{
            ser.delete(userInfo);
            return new ResponseObject("删除成功","200",null);
        }

    }
}
