package com.crud.service.impl;

import com.crud.dao.UserRepository;
import com.crud.pojo.User;
import com.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public String  addUser(User user) {
        userDao.save(user);
        return "添加成功！";
    }

    @Override
    public String updateUser(User user) {
        userDao.save(user);
        return "修改成功";
    }

    @Override
    public void  deleteUserById(Integer id) {
         userDao.deleteById(id);
    }

}
