package com.cms.service;

import com.cms.pojo.User;

/**
 * @Author：bingfeng
 * @Date：2024/10/17 15:24
 */
public interface UserService {
    User findByUsername(String username);
    void update(String username, String password);
    void register(String username, String password);
}
