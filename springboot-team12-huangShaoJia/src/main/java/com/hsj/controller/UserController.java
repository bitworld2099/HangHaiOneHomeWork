package com.hsj.controller;

import com.hsj.pojo.User;
import com.hsj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.util.Streamable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * @author Shinelon
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/user")
    public String add(@RequestBody User user){
        try{
            userService.add(user);
            return "OK";
        }catch (Exception e){
            return "FAIL";
        }

    }

    @GetMapping("/user/{id}")
    public Optional<User> findById(@PathVariable("id") Integer id){
       return userService.findById(id);
    }

    @PutMapping("/user")
    public User upda(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public String del(Integer id){
        try{
            userService.del(id);
            return "OK";
        }catch (Exception e){}
            return "FAIL";
    }

    @GetMapping("/paging")
    @ResponseBody
    public Page<User> queryPage(HttpServletRequest request){
        Sort sort= Sort.by(Sort.Direction.ASC,"id");
        //前端传来的当前页
        Integer NowPage=Integer.parseInt(request.getParameter("NowPage"));
        //把数据分为几页,从前端代码接受所需要你每页分多少数据
        Integer pagingSize=Integer.parseInt(request.getParameter("pagingSize"));
        //进行分页
        Pageable pageable = PageRequest.of(NowPage-1,pagingSize,sort);
        //Pageable pageable = PageRequest.of(0,10);//测试使用
        return userService.queryPage(pageable);
    }
}
