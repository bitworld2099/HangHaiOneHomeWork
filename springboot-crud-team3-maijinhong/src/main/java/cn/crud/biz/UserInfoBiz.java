package cn.crud.biz;

import cn.crud.pojo.UserInfo;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 用户业务接口
 */
public interface UserInfoBiz {
    //查询所有用户
    public List<UserInfo> findAll();
    //条件查询
    public List<UserInfo> queryUser(UserInfo userInfo);
    //新增用户
    public void addUser(UserInfo userInfo);
    //修改用户
    public UserInfo changeUser(UserInfo userInfo);
    //删除用户
    @Transactional
    void deleteUser(Integer id);
}
