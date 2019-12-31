package com.work.curd.service;

import com.work.curd.Dao.UserInfoRepository;
import com.work.curd.pojo.UserInfo;
import com.work.curd.servieceimpl.ServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
用户业务实现类
 */
@Service
public class UserService implements ServiceImplements {
    //注入Dao
    @Autowired
    private UserInfoRepository userDao;

    //查询所有用户
    @Override
    public List<UserInfo> query() {
        return userDao.findAll();
    }
    //添加用户
    @Override
    public void add(UserInfo user) {
        userDao.save(user);
    }
    //删除用户
    @Override
    public void delete(UserInfo user) {
        String name=user.getUsername();
        String prov=user.getProvince();
        userDao.deleteType(name,prov);
    }
    //更新用户信息
    @Override
    public void modify(UserInfo user) {
        userDao.save(user);
    }

}
