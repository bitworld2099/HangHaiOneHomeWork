package cn.FGR.service;

import cn.FGR.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();

    public void deleteUserById(Integer id);

    public void create(User user);

    public void edit(User user);
}
