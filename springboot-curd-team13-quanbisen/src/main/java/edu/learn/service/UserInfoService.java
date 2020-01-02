package edu.learn.service;

import edu.learn.model.UserInfo;

import java.util.List;

/**
 * @author super lollipop
 * @date 19-12-27
 */
public interface UserInfoService {
    public void add(UserInfo userInfo);
    public List<UserInfo> findAll();
    public void delete(UserInfo userInfo);
    public void update(UserInfo userInfo);
}
