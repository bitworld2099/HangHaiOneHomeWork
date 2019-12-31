package com.gzmtu.mxdc.service;

import com.gzmtu.mxdc.dao.AdminDao;
import com.gzmtu.mxdc.entity.AdminDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author MXDC
 * @date 2019/12/31
 **/
@Service
public class AdminService implements UserDetailsService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdminDO adminDO = adminDao.findByUsername(username);

        if(adminDO == null){
            return null;
        }
        UserDetails userDetails =
                User.withUsername(adminDO.getUsername()).password(adminDO.getPassword()).authorities("admin").build();
        return userDetails;
    }
}
