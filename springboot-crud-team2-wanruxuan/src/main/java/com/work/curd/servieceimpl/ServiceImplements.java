package com.work.curd.servieceimpl;

import com.work.curd.pojo.UserInfo;
import org.apache.catalina.User;

import java.util.List;

/*
业务接口
 */
public interface ServiceImplements {
    //查询
    public List<UserInfo> query();
    //添加用户
    public void add(UserInfo user);
    //删除用户
    public void delete(UserInfo user);
    //修改用户
    public void modify(UserInfo user);
}
