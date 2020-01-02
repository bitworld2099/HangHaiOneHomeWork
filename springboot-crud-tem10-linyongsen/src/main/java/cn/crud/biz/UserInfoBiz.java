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

    //保存用户信息
    public void save(UserInfo userInfo);

    //删除用户
    public void delete(Integer id);
}
