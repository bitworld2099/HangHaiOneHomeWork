package com.jk.zwx.springbootteam4zhangweixin.biz;



import com.jk.zwx.springbootteam4zhangweixin.pojo.UserInfo;

import java.util.List;

/**
 * 用户业务接口
 */
public interface UserInfoBiz {
    //查询所有用户
    public List<UserInfo> findAll();
    //新增用户
    public void save(UserInfo userInfo);
    //修改用户
    public void update(UserInfo userInfo);
    //删除用户
    public void delete(Integer id);
}
