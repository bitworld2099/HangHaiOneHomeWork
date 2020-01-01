package cn.crud.biz;

import cn.crud.pojo.UserInfo;

import java.util.List;

/**
 * 用户业务接口
 */
public interface UserInfoBiz {
    //查询所有用户
    public List<UserInfo> findAll();
    //条件查询
    //新增用户
    public void add(UserInfo user);
    //修改用户
    public void update(UserInfo user);
    //删除用户
    public void delete(Integer id);
}