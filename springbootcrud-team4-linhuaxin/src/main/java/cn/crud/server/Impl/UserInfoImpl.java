package cn.crud.server.Impl;

import cn.crud.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import cn.crud.server.UserInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User用户业务实现类
 */
@Service
public class UserInfoImpl implements UserInfoServer {

    @Autowired
    private UserInfoRepository dao;
    //查询
    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }
    //新增
    @Override
    public void save(UserInfo userInfo) {
        dao.save(userInfo);
    }
    //修改
    @Override
    public void save2(UserInfo userInfo) {
        dao.save(userInfo);
    }
    //删除
    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

}
