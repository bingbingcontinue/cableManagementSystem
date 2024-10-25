package com.cms.controller;

import com.cms.pojo.User;
import com.cms.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * @Author：bingfeng
 * @Date：2024/10/17 14:55
 */
@Controller
public class LoginController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            currentUser.login(token);
            return "redirect:/home";  // 登录成功跳转
        } catch (AuthenticationException e) {
            return "login";  // 登录失败
        }
    }

    //    @RequestMapping("/login")
//    public String login(@RequestParam String username,
//                                        @RequestParam String password) {
//        User user = userService.findByUsername(username);
//        if (user != null && user.getPassword().equals(password)) {
//            return "firstpage";
//        }
//        return "Invalid credentials";
//
//    }
    @RequestMapping("/registerfisrt")
    public  String registerfisrt(){
        return "login/register";
    }
    @RequestMapping(value = "/register")
    public String register(String username, String password) {
//        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
//        userService.register(username, hashedPassword); // 假设你有一个register方法
        userService.register(username, password);
        return "login/login"; // 返回注册成功的视图
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    public String updatePassword(@RequestParam String username, @RequestParam String oldPassword, @RequestParam String newPassword) {
        User user = userService.findByUsername(username);
        if (user != null) {
//            boolean isValidOldPassword = BCrypt.checkpw(oldPassword, user.getPassword());
//            if (isValidOldPassword) {
//                String hashedNewPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
//                user.setPassword(hashedNewPassword);
//                userService.update(username, hashedNewPassword); // 确保更新到数据库
//                return "密码更新成功"; // 返回成功视图
//            }
        }
        return "旧密码错误"; // 返回错误信息
    }

}
