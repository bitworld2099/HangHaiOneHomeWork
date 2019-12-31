package cn.localhost.service.impl;

import cn.localhost.service.UserInfoService;
import cn.localhost.dao.UserInfoDao;
import cn.localhost.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author : forlxh
 * @date : 20:31 2019/12/31
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    @Override
    public void saveUser(UserInfo userInfo) {
        userInfoDao.save(userInfo);
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoDao.save(userInfo);
    }

    @Override
    public void deleteUserById(Integer id) {
        userInfoDao.deleteById(id);
    }
}
