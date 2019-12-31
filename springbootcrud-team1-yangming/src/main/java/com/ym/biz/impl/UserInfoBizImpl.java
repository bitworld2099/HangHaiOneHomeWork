package com.ym.biz.impl;

import com.ym.biz.UserInfoBiz;
import com.ym.dao.UserInfoRepository;
import com.ym.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoBizImpl implements UserInfoBiz {
    @Autowired
    private UserInfoRepository dao;
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public void addUser(User user) {
        dao.save(user);
    }

    @Override
    public void updateUser(User user) {
        dao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        dao.delete(user);
    }
}
