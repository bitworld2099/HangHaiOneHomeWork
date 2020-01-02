package edu.learn.service;

import edu.learn.dao.UserInfoDao;
import edu.learn.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author super lollipop
 * @date 19-12-27
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    private UserInfoDao userInfoDao;

    @Autowired
    public void setUserInfoDao(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }

    /**
     * 添加用户方法
     * @param userInfo
     */
    @Override
    public void add(UserInfo userInfo) {
        userInfoDao.save(userInfo);
    }

    /**
     * 查询所有的用户
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    /**
     * 根据参数id删除用户
     * @param userInfo
     */
    @Override
    public void delete(UserInfo userInfo) {
        userInfoDao.delete(userInfo);
    }

    /**
     * 更新操作
     * @param userInfo
     */
    @Override
    public void update(UserInfo userInfo) {
        userInfoDao.save(userInfo);
    }
}
