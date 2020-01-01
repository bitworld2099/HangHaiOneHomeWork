package com.dao;

import com.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao  extends JpaRepository<UserInfo,Integer>, JpaSpecificationExecutor<UserInfo> {

    //查询单个用户，搞到修改页面


}
