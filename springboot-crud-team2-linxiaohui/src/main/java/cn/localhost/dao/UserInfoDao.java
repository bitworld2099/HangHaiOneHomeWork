package cn.localhost.dao;

import cn.localhost.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author : forlxh
 * @date : 20:30 2019/12/31
 */

@Repository
public interface UserInfoDao extends JpaRepository<UserInfo,Integer>, JpaSpecificationExecutor<UserInfo> {

}
