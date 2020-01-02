package cn.crud.biz.impl;

import cn.crud.biz.UserInfoBiz;
import cn.crud.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 新增用户
     * @return
     */
    @Override
    public void create(UserInfo userInfo) {
        dao.save(userInfo);
    }

    @Override
    public void update(UserInfo userInfo) {
        dao.save(userInfo);
    }

    /**
     * 根据id删除用户
    * @return
     */
    @Override
    public void delById(Integer id) {
         dao.deleteById(id);
    }
}
