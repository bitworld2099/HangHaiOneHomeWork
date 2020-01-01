package cn.crud.biz;

import cn.crud.pojo.UserInfo;
import com.mysql.cj.jdbc.result.UpdatableResultSet;

import java.util.List;

public interface UserInfoBiz {
    //查询所有用户
    public List<UserInfo> findAll();
    //条件查询
    //新增用户
    public void save (UserInfo userInfo);
    //修改用户
    public void update (UserInfo userInfo);
    //删除用户
    public void deleteById(Integer id);
}
