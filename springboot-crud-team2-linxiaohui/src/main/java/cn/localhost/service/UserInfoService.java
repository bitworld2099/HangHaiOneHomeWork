package cn.localhost.service;

import cn.localhost.entity.UserInfo;

import java.util.List;

/**
 * @author : forlxh
 * @date : 20:31 2019/12/31
 */

public interface UserInfoService {
    //查询所有用户
    public List<UserInfo> findAll();
    //新增用户
    public void saveUser(UserInfo userInfo);
    //修改用户
    public void update(UserInfo userInfo);
    //删除用户
    public void deleteUserById(Integer id);


}
