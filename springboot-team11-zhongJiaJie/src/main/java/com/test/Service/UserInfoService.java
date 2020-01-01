package com.test.Service;

import com.test.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    //查询所有用户
    public List<UserInfo> findAll();
    //新增用户
    public void save(UserInfo userInfo);
    //修改用户
    public void update(UserInfo userInfo);
    //删除用户
    public void delete(Integer id);
}
