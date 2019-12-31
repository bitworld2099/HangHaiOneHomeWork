package top.chenxer.springbootvuecrud.biz;

import top.chenxer.springbootvuecrud.entity.UserInfo;

import java.util.List;

/**
 * @author xer97
 * @date 2019/12/25 11:16
 */
public interface UserInfoBiz {
    List<UserInfo> listUserInfo();

    UserInfo getUserInfo(Integer id);

    UserInfo saveUserInfo(UserInfo userInfo);

    String deleteUserInfo(Integer id);
}
