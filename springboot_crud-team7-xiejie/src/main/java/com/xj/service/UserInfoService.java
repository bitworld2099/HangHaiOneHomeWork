package com.xj.service;

import com.xj.pojo.UserInfo;
import java.util.List;

public interface UserInfoService {
    //查询所有用户
    public List<UserInfo> findAll();
    //新增用户
    public UserInfo insUserInfo(UserInfo userInfo);
    //修改用户
    public UserInfo updUserInfo(UserInfo userInfo);
    //删除用户
    public void delUserInfo(int index);
}
