package com.gzmtu.mxdc.controller;

import com.gzmtu.mxdc.entity.UserDO;
import com.gzmtu.mxdc.service.UserService;
import com.gzmtu.mxdc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author MXDC
 * @date 2019/12/27
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/user"},method = RequestMethod.GET)
    @ResponseBody
    public ResultVO listUser(){
        List<UserDO> userDOList = userService.listUser();
        return ResultVO.success(userDOList);
    }

    @RequestMapping(value = {"/user"},method = RequestMethod.POST)
    @ResponseBody
    public ResultVO addUser(@RequestBody @Valid UserDO userDO){
         UserDO result = userService.addUser(userDO);
         return result == null ? ResultVO.failure() : ResultVO.success(result);
    }

    @RequestMapping(value = {"/user"},method = RequestMethod.PUT)
    @ResponseBody
    public ResultVO updateUser(@RequestBody @Valid UserDO userDO){
        UserDO result = userService.update(userDO);
        return result == null ? ResultVO.failure() : ResultVO.success(result);
    }

    @RequestMapping(value = {"/user/{id}"},method = RequestMethod.DELETE)
    @ResponseBody
    public ResultVO deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return  ResultVO.success();
    }

    @RequestMapping(value = {"index"},method = RequestMethod.GET)
    public String index(){
        return "crud";
    }

    @RequestMapping(value = {"error"},method = RequestMethod.GET)
    public String error(){
        return "error";
    }

}
