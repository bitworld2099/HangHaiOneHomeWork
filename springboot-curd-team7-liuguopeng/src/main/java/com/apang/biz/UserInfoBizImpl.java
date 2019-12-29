package com.apang.biz;

import com.apang.dao.UserInfoRepository;
import com.apang.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoBizImpl implements UserInfoBiz{
    @Autowired
    private UserInfoRepository dao;

    //查询所有用户
    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }

    //新增(更新)用户
    @Override
    public void save(UserInfo userInfo) {
        dao.save(userInfo);
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }
}
