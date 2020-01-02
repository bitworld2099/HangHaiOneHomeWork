package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    //自动注入业务层
    @Autowired
    private UserInfoBiz biz;

    @RequestMapping(method =RequestMethod.GET)
    public List<UserInfo> findAllUser(){
        return biz.findAll();
    }


    @RequestMapping(method =RequestMethod.POST)
    public ResponseObject createUser(@RequestBody UserInfo userInfo){
        biz.create(userInfo);
        ResponseObject object = new ResponseObject("新增用户成功", 1, null);
        return object;
    }
    @RequestMapping(method =RequestMethod.PUT)
    public ResponseObject updateUser(@RequestBody UserInfo userInfo){
        biz.update(userInfo);
        ResponseObject object = new ResponseObject("更新用户成功", 1, null);
        return object;
    }


    @RequestMapping(method =RequestMethod.DELETE)
    public ResponseObject deleteById(@RequestBody Integer id){
        System.out.println(id);
        try{
            biz.delById(id);
            return new ResponseObject("删除用户成功",1,null);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseObject("删除用户失败",0,null);
        }
    }
}
