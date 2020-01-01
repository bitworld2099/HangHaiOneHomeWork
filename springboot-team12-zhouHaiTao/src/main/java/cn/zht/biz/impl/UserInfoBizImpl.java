package cn.zht.biz.impl;

import cn.zht.biz.UserInfoBiz;
import cn.zht.dao.UserInfoRepository;
import cn.zht.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public User updateUser(User user) {

        return dao.save(user);
    }

    @Override
    public User add(User user) {
        return dao.save(user);

    }

    @Override
    public void del(Integer id) {
       dao.deleteById(id);
    }
}
