package cn.crud.biz;

import cn.crud.pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;



public interface UserInfoService {
     List<UserInfo> findAll();
     void modify(UserInfo user);
     void delete(Integer id);
     void create(UserInfo user);
}
