package cn.crud.biz.impl;

import cn.crud.biz.UserInfoBiz;
import cn.crud.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    public List<UserInfo> queryUser(UserInfo userInfo) {
        return dao.findAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        dao.save(userInfo);
    }

    @Override
    public UserInfo changeUser(UserInfo userInfo) {
        return dao.save(userInfo);
    }

    @Override
    public void deleteUser(Integer id) {
        dao.deleteById(id);
    }
}
