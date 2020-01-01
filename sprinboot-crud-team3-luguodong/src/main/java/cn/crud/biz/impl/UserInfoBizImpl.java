package cn.crud.biz.impl;

import cn.crud.biz.UserInfoBiz;
import cn.crud.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoBizImpl implements UserInfoBiz {
    @Override
    public void save(UserInfo userInfo) {
        userDao.save(userInfo);
    }

    @Override
    public void update(UserInfo userInfo) {
        userDao.save(userInfo);
    }

    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }

    @Autowired
    private UserInfoRepository userDao;

    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }
}