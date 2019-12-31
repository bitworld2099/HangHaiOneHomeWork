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
     * 新增用户信息
     * @param userInfo
     */
    @Override
    public void save(UserInfo userInfo) {
        dao.save(userInfo);
    }

    /**
     * 更新用户信息
     * @param userInfo
     */
    @Override
    public void updata(UserInfo userInfo) {
        dao.save(userInfo);
    }

    /**
     * 删除用户信息
     * @param id
     */
    @Override
    public void del(int id) {
        dao.deleteById(id);
    }
}
