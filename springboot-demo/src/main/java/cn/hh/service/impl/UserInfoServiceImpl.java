package cn.hh.service.impl;

import cn.hh.dao.UserInfoRepository;
import cn.hh.dao.UserRepository;
import cn.hh.pojo.UserInfo;
import cn.hh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoRepository userDao;

    /**
     * 新增用户信息
     * @param userInfo
     */
    @Override
    public void save(UserInfo userInfo) {
        userDao.save(userInfo);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }
}
