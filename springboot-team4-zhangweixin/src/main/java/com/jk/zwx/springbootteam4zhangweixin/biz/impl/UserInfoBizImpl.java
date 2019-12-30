package com.jk.zwx.springbootteam4zhangweixin.biz.impl;


import com.jk.zwx.springbootteam4zhangweixin.biz.UserInfoBiz;
import com.jk.zwx.springbootteam4zhangweixin.dao.UserInfoRepository;
import com.jk.zwx.springbootteam4zhangweixin.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class UserInfoBizImpl implements UserInfoBiz {

    @Autowired
    private UserInfoRepository dao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }

    @Override
    public void save(UserInfo userInfo) {
        dao.save(userInfo);
    }

    @Override
    public void update(UserInfo userInfo) {
        dao.save(userInfo);
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }
}
