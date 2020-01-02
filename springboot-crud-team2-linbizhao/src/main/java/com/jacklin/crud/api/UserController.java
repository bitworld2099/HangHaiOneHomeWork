package com.jacklin.crud.api;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.jacklin.crud.dao.UserDao;
import com.jacklin.crud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Desc: 用户服务
 * @Date 2020/1/1 21:38
 * @Author 林必昭 793066408@qq.com
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    /**
     * 获取用户列表
     */
    @GetMapping("list")
    public ResponseEntity<List<User>> listUser(){
        return ResponseEntity.ok(userDao.findAll());
    }

    /**
     * 新增
     */
    @PostMapping
    public ResponseEntity<JSONObject> addOne(@RequestBody JSONObject requestBody){
        JSONObject responseBody = new JSONObject();
        User user = null;
        try {
            user = JSONUtil.toBean(requestBody, User.class);
        }catch (Exception e){
            responseBody.put("msg","参数错误");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
        }
        try {
            user = userDao.save(user);
        }catch (Exception e){
            responseBody.put("msg", "服务器出错，请稍后重试！");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
        }
        return ResponseEntity.ok(JSONUtil.parseObj(user));
    }

    /**
     * 删除
     */
    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        userDao.deleteById(id);
        return ResponseEntity.ok(null);
    }

    /**
     * 更新
     */
    @PutMapping
    public ResponseEntity update(@RequestBody JSONObject requestBody){
        JSONObject responseBody = new JSONObject();
        return this.addOne(requestBody);
    }
}
