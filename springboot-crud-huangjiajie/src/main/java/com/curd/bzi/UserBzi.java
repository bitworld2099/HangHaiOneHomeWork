package com.curd.bzi;

import com.curd.pojo.User;

import javax.persistence.Id;
import java.util.List;

public interface UserBzi {
    public List<User> findAll();
    public void save(User user);
    public void update(User user);
    public void del(User user);
}
