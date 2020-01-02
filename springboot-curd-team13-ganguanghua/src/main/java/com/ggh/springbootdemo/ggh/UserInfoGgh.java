package com.ggh.springbootdemo.ggh;



import com.ggh.springbootdemo.entities.User;


import java.util.List;
import java.util.Optional;

/**
 * 用户业务接口
 */
public interface UserInfoGgh {
    //查询所有用户
    public List<User> findAll();
    //条件查询
    public Optional<User> findById(Integer id);

    //新增用户

    public User add(User user);
    //修改用户
    public User updateUser(User user);
    //删除用户
    public void del(Integer id);

}
