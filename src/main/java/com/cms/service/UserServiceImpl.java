package com.cms.service;

import com.cms.dao.UserMapper;
import com.cms.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：bingfeng
 * @Date：2024/10/22 10:55
 */
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findByUsername(String username) {
        User user = userMapper.findByUsername(username);
        return user;
    }
    @Override
    public void update(String username, String password) {
        userMapper.update(username, password);
    }
    @Override
    public void register(String username, String password) {
        userMapper.register(username, password);
    }
}
