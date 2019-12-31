package com.gzmtu.mxdc.dao;

import com.gzmtu.mxdc.entity.AdminDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MXDC
 * @date 2019/12/31
 **/
public interface AdminDao extends JpaRepository<AdminDO,Integer> {

    AdminDO findByUsername(String username);
}
