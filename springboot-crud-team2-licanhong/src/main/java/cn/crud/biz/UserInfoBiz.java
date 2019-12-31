package cn.crud.biz;

import cn.crud.pojo.UserInfo;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * 用户业务接口
 */
public interface UserInfoBiz {
    //查询所有用户
    List<UserInfo> findAll();
    //条件查询
    //新增用户
    @Transactional
    UserInfo addUser(UserInfo userInfo);
    //修改用户
    @Transactional
    UserInfo updateUser(UserInfo userInfo);
    //删除用户
    @Transactional
    void deleteUser(Integer id);
}
