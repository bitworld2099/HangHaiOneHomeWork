package cn.hh.service;

import cn.hh.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    //新增用户
    public void save(UserInfo userInfo);
    //查询所有用户信息
    public List<UserInfo> findAll();
}
