package com.service.impl;

import com.dao.UserInfoDao;
import com.pojo.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 用户业务实现类
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    /**
     * 查询单个用户，搞到修改页面
     * @param id
     * @return
     * @throws RuntimeException
     */
    @Override
    public Optional<UserInfo> findById(Integer id) throws RuntimeException {
        return userInfoDao.findById(id);
    }

    @Override
    public UserInfo insert(UserInfo userInfo) throws RuntimeException {
        return userInfoDao.save(userInfo);
    }

    @Override
    public int update(UserInfo userInfo) throws RuntimeException {
        if(userInfoDao.existsById(userInfo.getId())){
            userInfoDao.save(userInfo);
            return 1;
        }
        return 0;
    }

    @Override
    public int delete(Integer id) throws RuntimeException {
        if(userInfoDao.existsById(id)){
            userInfoDao.deleteById(id);
            return 1;
        }
        return 0;
    }
}
