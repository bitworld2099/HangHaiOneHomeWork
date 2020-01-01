package com.jk.biz.impl;

import com.jk.biz.UserInfoBiz;
import com.jk.dao.UserInfoRepository;
import com.jk.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author Zvoy
 * @Date 2019/12/26 17:18
 * @Version 1.0
 */
@Service
public class UserInfoBizImpl implements UserInfoBiz {

    @Autowired
    private UserInfoRepository userRepository;
    @Override
    public List<UserInfo> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserInfo> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public UserInfo updateUser(UserInfo user) {

        return userRepository.save(user);
    }

    @Override
    public UserInfo add(UserInfo user) {
        return userRepository.save(user);

    }

    @Override
    public void del(Integer id) {
        userRepository.deleteById(id);
    }

}
