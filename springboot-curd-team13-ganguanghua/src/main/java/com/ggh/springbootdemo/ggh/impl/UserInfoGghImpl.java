package com.ggh.springbootdemo.ggh.impl;


import com.ggh.springbootdemo.dao.UserInfoRepository;
import com.ggh.springbootdemo.entities.User;
import com.ggh.springbootdemo.ggh.UserInfoGgh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * 用户业务实现类
 */
@Service
public class UserInfoGghImpl implements UserInfoGgh {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public List<User> findAll() {
        return userInfoRepository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userInfoRepository.findById(id);
    }


    @Override
    public User updateUser(User user) {

        return userInfoRepository.save(user);
    }


    @Override
    public User add(User user) {
        return userInfoRepository.save(user);

    }

    @Override
    public void del(Integer id) {
        userInfoRepository.deleteById(id);
    }
}
