package edu.learn.dao;

import edu.learn.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author super lollipop
 * @date 19-12-27
 */
@Repository
public interface UserInfoDao extends JpaRepository<UserInfo,Integer> , JpaSpecificationExecutor<UserInfo> {
}
