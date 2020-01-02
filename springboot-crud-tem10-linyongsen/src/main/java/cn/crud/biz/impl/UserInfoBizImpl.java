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
    /*
    保存信息
     */
    @Override
    public void save(UserInfo userInfo) {
        dao.save(userInfo);
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }
}
