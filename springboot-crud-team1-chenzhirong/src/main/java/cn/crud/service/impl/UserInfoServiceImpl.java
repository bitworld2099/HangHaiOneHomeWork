package cn.crud.service.impl;

import cn.crud.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    /**
     * 更新
     * @param userInfo
     */
    @Override
    public void update(UserInfo userInfo) {
        userDao.save(userInfo);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }

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
