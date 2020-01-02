package cn.crud.biz;

import cn.crud.pojo.UserInfo;

import java.util.List;

/**
 * 用户业务接口
 */
public interface UserInfoBiz {
    //返回所有用户
    public List<UserInfo> findAll();
    //创建新用户
    void create(UserInfo userInfo);
    //修改用户信息
     void update(UserInfo userInfo);
    //根据id删除用户
     void delById(Integer id);
}
