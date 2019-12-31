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
     * 添加一个新的用户
     * @return
     */
    @Override
    public UserInfo addUser(UserInfo userInfo) {
        return dao.saveAndFlush(userInfo);
    }

    /**
     * 修改用户
     * @param userInfo
     * @return
     */
    @Override
    public UserInfo updateUser(UserInfo userInfo) {
        return dao.saveAndFlush(userInfo);
    }

    /**
     * 根据id删除对应的用户
     * @param id
     */
    @Override
    public void deleteUser(Integer id) {
        dao.deleteById(id);

    }
}
