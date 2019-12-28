package com.gzmtu.mxdc.service;

import com.gzmtu.mxdc.dao.UserDao;
import com.gzmtu.mxdc.entity.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MXDC
 * @date 2019/12/28
 **/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<UserDO> listUser() {
      return  userDao.findAll();
    }

    public UserDO addUser(UserDO userDO) {
        userDO = userDao.save(userDO);
        return userDO;
    }

    public void deleteUser(Integer id) {
        userDao.deleteById(id);
    }

    public UserDO update(UserDO userDO){
        UserDO save = userDao.save(userDO);
        return save;
    }
}
