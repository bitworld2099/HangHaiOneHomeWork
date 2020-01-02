package cn.crud.service.serviceImpl;

import cn.crud.dao.UserInfoRepository;
import cn.crud.pojo.UserInfo;
import cn.crud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    //依赖注入dao类
    @Autowired
    private UserInfoRepository dao;
    /*
    查询所有用户
     */
    @Override
    public List<UserInfo> findall() {
        return dao.findAll();
    }
    /*
    新增用户
     */
    @Override
    public void save(UserInfo userInfo) {
        dao.save(userInfo);

    }
    /*
    修改用户
     */
    @Override
    public void modif(UserInfo userInfo) {
        dao.save(userInfo);

    }
    /*
    删除用户
     */

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);

    }
}
