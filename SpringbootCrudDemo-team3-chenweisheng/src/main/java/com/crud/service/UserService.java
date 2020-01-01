package com.crud.service;

import com.crud.pojo.User;

import java.util.List;

public interface UserService {
    //新增用户
    public void save(User user);

    //查询所有用户
    public List<User> findAll();

    //修改用户
    public void update(User user);

    //删除用户
    public void deleteById(Integer id);
}
