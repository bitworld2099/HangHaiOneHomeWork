package com.hy.controller;

import com.hy.biz.UserInfoBiz;
import com.hy.pojo.UserInfo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @创建人 hy
 * @创建时间 2019/12/27
 * @描述
 */
@RestController
@RequestMapping("/user")
public class CrudController {
    //注入业务层
    @Autowired
    private UserInfoBiz biz;

    @GetMapping
    public List<UserInfo> findAll(){
        return biz.findAll();
    }

    @PutMapping
    public void updateUserInfo(@RequestParam(value = "userInfo")String userInfo, @RequestParam(value = "id")Integer id) {
        JSONObject jsonObject = JSONObject.fromObject(userInfo);
        UserInfo user = new UserInfo();
        user.setUsername(jsonObject.getString("username"));
        user.setEmail(jsonObject.getString("email"));
        user.setProvince(jsonObject.getString("province"));
        user.setSex(jsonObject.getString("sex"));
        JSONArray jsonArray = jsonObject.getJSONArray("hobby");
        String hobby = new String();
        for(int i = 0; i < jsonArray.size(); i++) {
            hobby = hobby + jsonArray.getString(i) + ",";
        }
        hobby = hobby.substring(0, hobby.length() - 1);
        user.setHobby(hobby);
        user.setId(id);
        biz.updateUserInfo(user);
    }

    @PostMapping
    public void addUserInfo(@RequestBody String userInfo) {
        JSONObject jsonObject = JSONObject.fromObject(userInfo);
        UserInfo user = new UserInfo();
        user.setUsername(jsonObject.getString("username"));
        user.setEmail(jsonObject.getString("email"));
        user.setProvince(jsonObject.getString("province"));
        user.setSex(jsonObject.getString("sex"));
        JSONArray jsonArray = jsonObject.getJSONArray("hobby");
        String hobby = new String();
        for(int i = 0; i < jsonArray.size(); i++) {
            hobby = hobby + jsonArray.getString(i) + ",";
        }
        hobby = hobby.substring(0, hobby.length() - 1);
        user.setHobby(hobby);
        biz.addUserInfo(user);
    }

    @DeleteMapping
    public void delUserInfo(@RequestParam(value = "id")Integer id) {
        biz.delUserInfo(id);
    }
}
