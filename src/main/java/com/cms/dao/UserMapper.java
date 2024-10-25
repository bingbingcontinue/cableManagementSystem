package com.cms.dao;

import com.cms.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author：bingfeng
 * @Date：2024/10/17 15:19
 */
@Repository
public interface UserMapper{
    User findByUsername(String username);
    void update(String username,String password);
    void register(@Param("username")String username, @Param("password")String password);
}
