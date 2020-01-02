package cn.crud.biz;

import cn.crud.pojo.UserInfo;


import java.util.List;

public interface UserInfoBiz {
    public List<UserInfo> findAll();
}
