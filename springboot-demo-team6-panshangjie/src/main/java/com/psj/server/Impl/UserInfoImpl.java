package com.psj.server.Impl;

import com.psj.dao.UserInfoRepository;
import com.psj.pojo.UserInfo;
import com.psj.server.UserInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoImpl implements UserInfoServer{
    @Autowired
    private UserInfoRepository dao;
    //查询
    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }
    //新增
    @Override
    public void save(UserInfo userInfo) {
        dao.save(userInfo);
    }
    //修改
    @Override
    public void save2(UserInfo userInfo) {
        dao.save(userInfo);
    }
    //删除
    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }
}
