package cn.crud.biz.impl;

import cn.crud.biz.UserInfoBiz;
import cn.crud.dao.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoBizeImpl implements UserInfoBiz {
    @Autowired
    private UserInfoRepository dao;

    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }


}
