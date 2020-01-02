package com.adidi.Service.impl;

import com.adidi.Service.UserInfoService;
import com.adidi.dao.UserInfoDao;
import com.adidi.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    /**
     * 查询所有用户
     * @return
     * */
    @Override
    public List<UserInfo> findAll(){
        return userInfoDao.findAll();
    }

    /**
     * 新增用户
     * @param userInfo
     */
    @Override
    public void save(UserInfo userInfo) {
        userInfoDao.save(userInfo);
    }

    /**
     * 修改用户
     * @param userInfo
     */
    public void update(UserInfo userInfo){
        userInfoDao.save(userInfo);
    }

    /**
     * 删除用户
     * @param id
     */
    public void delete(Integer id){
        userInfoDao.deleteById(id);
    }
}
