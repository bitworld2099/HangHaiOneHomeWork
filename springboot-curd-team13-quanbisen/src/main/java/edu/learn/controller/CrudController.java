package edu.learn.controller;

import edu.learn.model.ResponseObject;
import edu.learn.model.UserInfo;
import edu.learn.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author super lollipop
 * @date 19-12-27
 */
@RestController
@RequestMapping("/userinfo")
public class CrudController {


    private UserInfoService userInfoService;

    @Autowired
    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Object query(){
        return userInfoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseObject create(@RequestBody UserInfo userInfo){
        userInfoService.add(userInfo);
        return new ResponseObject("新增成功","200",null);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseObject delete(@RequestBody UserInfo userInfo){
        userInfoService.delete(userInfo);
        return new ResponseObject("删除成功","200",null);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseObject update(@RequestBody UserInfo userInfo){
        userInfoService.update(userInfo);
        return new ResponseObject("更新成功","200",null);
    }
}
