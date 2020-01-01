package com.work.curd.Dao;

import com.work.curd.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>, JpaSpecificationExecutor<UserInfo> {
    @Transactional
    @Modifying
    @Query(value = "delete from users where username= ?1 and province= ?2", nativeQuery = true)
    void deleteType(String name, String prov);
}

