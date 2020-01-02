package cn.crud.service;

import cn.crud.pojo.UserInfo;

import java.util.List;

/**
 * 用户业务接口
 */
public interface UserInfoService {
    //查询所有用户
    public List<UserInfo> findall();
    //新增用户
    public void save(UserInfo userInfo);
    //修改用户
    public void modif(UserInfo userInfo);
    //删除用户
    public void delete(Integer id);

}
