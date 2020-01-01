package com.gzhmt.service.impl;

import com.gzhmt.dao.UserInfoRepository;
import com.gzhmt.pojo.UserInfo;
import com.gzhmt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository dao;

    @Override
    public List<UserInfo> finaAll() {   //查询所有用户

        return dao.findAll();
    }

    @Override
    public void delete(Integer id) {    //根据id删除用户

        dao.deleteById(id);
    }

    @Override
    public void save(UserInfo user) {   //新增用户
        dao.save(user);
    }

    @Override
    public void update(UserInfo user) {     //修改用户
            dao.save(user);
    }


}
