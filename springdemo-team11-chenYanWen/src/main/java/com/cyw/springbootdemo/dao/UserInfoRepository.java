package com.cyw.springbootdemo.dao;



import com.cyw.springbootdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

}
