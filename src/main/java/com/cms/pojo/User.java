package com.cms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @Author：bingfeng
 * @Date：2024/10/17 14:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class User {
    private Integer id;
    private Integer rid;
    private String username;
    private String password;  // 密码加密后存储
}
