package top.chenxer.springbootvuecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import top.chenxer.springbootvuecrud.entity.UserInfo;

/**
 * @author xer97
 * @date 2019/12/25 10:58
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>, JpaSpecificationExecutor<UserInfo> {

}
