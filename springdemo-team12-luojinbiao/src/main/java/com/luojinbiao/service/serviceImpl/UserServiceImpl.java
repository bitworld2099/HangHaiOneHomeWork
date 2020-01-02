package com.luojinbiao.service.serviceImpl;

import com.luojinbiao.dao.UserRepository;
import com.luojinbiao.pojo.User;
import com.luojinbiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 服务层
 * @author Shinelon
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(User user) {

       return userRepository.save(user);
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);

    }

    @Override
    public void del(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<User> queryPage(Pageable pageable) {
        return (Page<User>) userRepository.findAll(pageable);
    }
}
