package com.crud.service.impl;

import com.crud.service.UserService;
import com.crud.dao.UserDao;
import com.crud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }
}
