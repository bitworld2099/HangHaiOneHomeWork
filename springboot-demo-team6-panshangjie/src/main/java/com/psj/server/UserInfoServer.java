package com.psj.server;
import com.psj.pojo.UserInfo;

import java.util.List;

public interface UserInfoServer {
    //查询
    public List<UserInfo> findAll();
    //新增
    public void save(UserInfo userInfo);
    //修改
    public void save2(UserInfo userInfo);
    //删除
    public void delete(Integer id);
}
