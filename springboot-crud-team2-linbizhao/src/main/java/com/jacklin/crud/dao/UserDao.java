package com.jacklin.crud.dao;

import com.jacklin.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Desc: Dao层
 * @Date 2020/1/1 21:36
 * @Author 林必昭 793066408@qq.com
 */

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
