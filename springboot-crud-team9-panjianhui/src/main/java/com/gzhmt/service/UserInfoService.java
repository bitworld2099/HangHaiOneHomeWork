package com.gzhmt.service;

import com.gzhmt.pojo.UserInfo;
import java.util.List;

public interface UserInfoService {
    //查询所有用户
    public List<UserInfo> finaAll();

    //删除
    public void delete(Integer id);

    //新增用户
    public void save(UserInfo user);

    //修改
    public void update(UserInfo user);
}
