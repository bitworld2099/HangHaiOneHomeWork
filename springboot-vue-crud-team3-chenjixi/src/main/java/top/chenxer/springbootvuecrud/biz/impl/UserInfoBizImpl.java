package top.chenxer.springbootvuecrud.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.chenxer.springbootvuecrud.biz.UserInfoBiz;
import top.chenxer.springbootvuecrud.dao.UserInfoRepository;
import top.chenxer.springbootvuecrud.entity.UserInfo;

import java.util.List;
import java.util.Objects;

/**
 * @author xer97
 * @date 2019/12/25 11:17
 */
@Service
public class UserInfoBizImpl implements UserInfoBiz {

    private UserInfoRepository userInfoRepository;

    @Override
    public List<UserInfo> listUserInfo() {
        return userInfoRepository.findAll();
    }

    @Override
    public UserInfo getUserInfo(Integer id) {
        return userInfoRepository.getOne(id);
    }

    @Override
    public UserInfo saveUserInfo(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
        if(Objects.isNull(userInfo.getId())){
            return userInfo;
        }else{
            return userInfo;
        }
    }

    @Override
    public String deleteUserInfo(Integer id) {
        userInfoRepository.deleteById(id);
        return "删除成功！";
    }

    @Autowired
    public void setUserInfoRepository(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }
}
