package com.curd.bzi.Impl;

import com.curd.bzi.UserBzi;
import com.curd.dao.UserRepository;
import com.curd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserBziImpl implements UserBzi {
   @Autowired
   private UserRepository userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void del(User user) {
        userDao.delete(user);
    }
}
