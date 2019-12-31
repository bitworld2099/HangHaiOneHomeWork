package com.wsn.biz;

import com.wsn.pojo.User;

import java.util.List;

public interface UserBiz {
    //查询所有用户
    public List<User> findAll();
    //增加用户
    public void save(User user);
    //删除用户
    public void delete(User user);
    //更改用户
    public void update(User user);

}
