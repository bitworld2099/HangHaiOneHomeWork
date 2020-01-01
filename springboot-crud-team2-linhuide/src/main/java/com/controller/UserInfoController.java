package com.controller;

import com.group.UpdateGroup;
import com.pojo.UserInfo;
import com.service.UserInfoService;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.groups.Default;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    //注入业务层
    @Autowired
    private UserInfoService userInfoService;

    //修改
    @PutMapping()
    public String update(@RequestBody @Validated({UpdateGroup.class, Default.class}) UserInfo userInfo){
        System.out.println("要修改的用户： "+userInfo);
        int rows=userInfoService.update(userInfo);
        if (rows == 1) {
            return "修改成功";
        }else {
            return "修改失败,没有这个用户";
        }
    }

    //查询单个，给修改


    //删除，正则表达式排除不是数字的
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id){
        System.out.println("要删除的id："+id);
        int rows=userInfoService.delete(id);
        if (rows == 1) {
            return "删除成功";
        }else {
            return "删除失败,没有这个用户id";
        }
    }

    //增加
    @PostMapping()
    public String create(@RequestBody @Valid UserInfo userinfo){
        UserInfo user=userInfoService.insert(userinfo);
        if (user!=null) {
            return "增加成功";
        }else {
            return "增加失败";
        }
    }


    //查询所有数据
    @GetMapping
    public List<UserInfo> findAll(){
        List<UserInfo> userInfos=userInfoService.findAll();
        return userInfos;
    }
}
