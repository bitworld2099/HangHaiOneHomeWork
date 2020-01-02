package cn.crud.service.impl;

import cn.crud.pojo.UserInfo;
import java.util.List;

public interface UserInfoService {
    //新增用户
    public void save(UserInfo userInfo);
    //查询所有用户信息
    public List<UserInfo> findAll();
    //修改用户
    public void update(UserInfo userInfo);
    //删除用户
    public void deleteById(Integer id);

}
