package crud.service.impl;

import crud.dao.UserInfoRepository;
import crud.pojo.UserInfo;
import crud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository dao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return dao.findAll();
    }

    /**
     * 添加用户
     * @param userInfo
     */
    @Override
    public void saveUser(UserInfo userInfo) {
          dao.save(userInfo);
    }

    /**
     * 修改用户
     * @param userInfo
     */
    @Override
    public void updateUser(UserInfo userInfo) {
        dao.save(userInfo);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void deleteUser(Integer id) {
        dao.deleteById(id);
    }
}
