package com.jk.biz;

import com.jk.pojo.UserInfo;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @Author Zvoy
 * @Date 2019/12/26 17:21
 * @Version 1.0
 */
public interface UserInfoBiz {
    /**
     * 查找所有用户
     * @return
     */
    public List<UserInfo> findAll();

    /**
     * 通过id查找用户
     * @return
     */
    public Optional<UserInfo> findById(Integer id);

    /**
     * 更新用户
     * @param user
     * @return
     */
    public UserInfo updateUser(UserInfo user);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public UserInfo add(UserInfo user);

    /**
     * 删除用户
     * @param id
     */
    public void del(Integer id);
}
