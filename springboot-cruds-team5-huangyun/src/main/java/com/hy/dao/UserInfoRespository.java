package com.hy.dao;

import com.hy.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @创建人 hy
 * @创建时间 2019/12/27
 * @描述
 */
public interface UserInfoRespository extends JpaRepository<UserInfo,Integer>, JpaSpecificationExecutor<UserInfo> {

}
