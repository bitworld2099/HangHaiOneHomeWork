package com.ggh.springbootdemo.dao;



import com.ggh.springbootdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

}
