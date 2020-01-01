package com.test.dao;

import com.test.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao extends JpaRepository<UserInfo,Integer>, JpaSpecificationExecutor<UserInfo> {
}
