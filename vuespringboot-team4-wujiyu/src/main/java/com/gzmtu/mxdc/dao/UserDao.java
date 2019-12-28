package com.gzmtu.mxdc.dao;

import com.gzmtu.mxdc.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MXDC
 * @date 2019/12/28
 **/
public interface UserDao extends JpaRepository<UserDO,Integer> {
}
