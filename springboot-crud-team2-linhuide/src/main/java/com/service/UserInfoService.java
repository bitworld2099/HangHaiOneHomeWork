package com.service;

import com.pojo.UserInfo;

import java.util.List;
import java.util.Optional;

/**
 * 用户业务接口
 */
public interface UserInfoService {
    //查询所有用户
    public List<UserInfo> findAll() throws RuntimeException;

    //条件查询
    public Optional<UserInfo> findById(Integer id) throws RuntimeException;

    //新增用户
    public UserInfo insert(UserInfo userInfo) throws RuntimeException;

    //修改用户
    public int update(UserInfo userInfo) throws RuntimeException;

    //删除用户
    public int delete(Integer id) throws RuntimeException;
}
