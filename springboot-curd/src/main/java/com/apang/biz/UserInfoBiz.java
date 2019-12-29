package com.apang.biz;


import com.apang.pojo.UserInfo;

import java.util.List;

public interface UserInfoBiz {
    //查询所有用户
    public List<UserInfo> findAll();

    //新增(更新)用户
    public void save(UserInfo userInfo);

    //删除用户
    public void delete(Integer id);
}
