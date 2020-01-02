package cn.crud.web.controller;

import cn.crud.pojo.User;
import cn.crud.pojo.Condition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController

public class UserController {
    //删除操作
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable String id){
        System.out.println("要删除的id："+id);
        return "删除成功";
    }
    //更新操作
    public User update(@RequestBody User user){
        user.setUsername("张三");
        user.setPassword("6666666");
        return user;
    }
    //创建请求
    @PostMapping(path="/user")
    public User create(@RequestBody @Valid User user, BindingResult errors){
        if(errors.hasErrors()){
           errors.getAllErrors().stream().forEach(e->{
               System.out.println(ReflectionToStringBuilder.toString(e, ToStringStyle.DEFAULT_STYLE));
           });
        }
        System.out.println("传来的创建用户对象："+user);
        return user;
    }
    //查询详情
    @GetMapping("/user/{id:\\d+}")
    public User getInfo(@PathVariable Integer id){
        System.out.println("传来的id是："+id);
        User user=new User();
        user.setId(id);
        return user;
    }
    @GetMapping("/user3")
    public List<User> query(Condition condition){
        //System.out.println("传来的参数对象："+condition);
        //System.out.println("传来的参数对象用户名："+condition.getUsername());
        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        List<User> list = new ArrayList<>();
        list.add(new User(1,"tom1","123"));
        list.add(new User(2,"tom2","123"));
        list.add(new User(3,"tom3","123"));
        return list;
    }

}
