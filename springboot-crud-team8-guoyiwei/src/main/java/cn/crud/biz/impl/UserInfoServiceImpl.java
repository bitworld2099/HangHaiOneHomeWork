package cn.crud.biz.impl;

import cn.crud.biz.UserInfoService;
import cn.crud.dao.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository dao;
    @Override
    public void  modify(UserInfo user) {
        dao.save(user);
    }

    @Override
    public void  delete(Integer id) {
        dao.deleteById(id);
    }



    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }

    @Override
    public void create(UserInfo user) {
        dao.save(user);
    }

}
