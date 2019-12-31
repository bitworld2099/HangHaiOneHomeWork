package com.hy.biz.impl;

import com.hy.biz.UserInfoBiz;
import com.hy.dao.UserInfoRespository;
import com.hy.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 hy
 * @创建时间 2019/12/27
 * @用户业务实现类
 */
@Service
public class UserInfoBizImpl implements UserInfoBiz {

    @Autowired
    private UserInfoRespository dao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }

    /**
     * 添加用户
     * @param userInfo
     */
    @Override
    public void addUserInfo(UserInfo userInfo) {
    dao.save(userInfo);
    }

    /**
     * 修改用户
     * @param userInfo
     */
    @Override
    public void updateUserInfo(UserInfo userInfo) {
        dao.save(userInfo);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void delUserInfo(Integer id) {
        dao.deleteById(id);
    }
}
