package cn.zht.controller;

import cn.zht.biz.UserInfoBiz;
import cn.zht.pojo.User;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

@RestController
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoBiz biz;
        @GetMapping("/user")
        public List<User> findAll(){
            return biz.findAll();
        }

        @PostMapping ("/user")
        public String add(@RequestBody User user){
            try{
                biz.add(user);
                return "OK";
            }catch (Exception e){
                return "FAIL";
            }

        }

        @GetMapping("/user/{id}")
        public Optional<User> findById(@PathVariable("id") Integer id){
            return biz.findById(id);
        }

        @PutMapping("/user")
        public User upda(@RequestBody User user){
            return biz.updateUser(user);
        }

        @DeleteMapping("/user")
        public String del(Integer id) {
            try{
            biz.del(id);
            return "OK";}
            catch (Exception e){
                return "FAIL";
            }
        }
}
