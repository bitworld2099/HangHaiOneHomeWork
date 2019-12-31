package com.wsn.biz.impl;

import com.wsn.biz.UserBiz;
import com.wsn.dao.UserRepository;
import com.wsn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBizImpl implements UserBiz {
    @Autowired
    private UserRepository dao;
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
    @Override
    public void save(User user) {
        dao.save(user);
    }
    @Override
    public void delete(User user) {
        dao.delete(user);
    }
    @Override
    public void update(User user) {
        dao.save(user);
    }
}
