package com.ym.biz;

import com.ym.pojo.User;

import java.util.List;

public interface UserInfoBiz {
    public List<User> findAll();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}
