package com.crud.service;

import com.crud.pojo.User;

import java.util.List;

/**
 * User服务层接口
 */
public interface IUserService {
    //查询所有用户
    public List<User> findAll();
    //添加用户
    public String addUser(User user);
    //更新用户
    public String updateUser(User user);
    //根据id删除用户
    public void deleteUserById(Integer id);
}
