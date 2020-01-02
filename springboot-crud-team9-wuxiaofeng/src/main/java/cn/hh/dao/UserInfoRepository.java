package cn.hh.dao;

import cn.hh.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>, JpaSpecificationExecutor<UserInfo> {
    //继承JpaSpecificationExecutor接口可以使用其提供的方法构建复杂的查询条件
}
