package com.cms.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;

//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import javax.annotation.Resource;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import com.hbst.basessm_1.pojo.request.LoginParamRequest;
//import com.hbst.basessm_1.service.IUserService;
//import com.hbst.basessm_1.util.baseUtil.ResourceUtils;
//import com.hbst.basessm_1.util.constant.CodeConstant;
//import com.hbst.basessm_1.util.entity.ResultMessage;
//import com.hbst.basessm_1.util.exception.BusinessException;
//import com.hbst.basessm_1.util.log.ISCLog;
//import com.hbst.basessm_1.util.log.impl.SCLogger;
//
//import net.sf.json.JSONObject;

/**
 * @author Dean
 */
@Controller
@RequestMapping("/user")
public class UserController {

        @RequestMapping("/login")
        public String login(String username, String password, Model model) {
            Subject currentUser = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            try {
                currentUser.login(token);
                return "redirect:/home"; // 登录成功重定向
            } catch (Exception e) {
                model.addAttribute("error", "用户名或密码错误");
                return "login"; // 返回登录页面
            }
        }

        @RequestMapping("/logout")
        public String logout() {
            Subject currentUser = SecurityUtils.getSubject();
            currentUser.logout();
            return "redirect:/login"; // 登出后重定向
        }






//    private static final ISCLog logger = new SCLogger(UserController.class);
//    @Resource
//    private IUserService userService;
//
//    /**
//     *
//     * @return
//     */
//    @ResponseBody
//    @RequestMapping(value = "/queryUser.do", method = RequestMethod.POST)
//    public Object queryUser(LoginParamRequest request, BindingResult result) {
//        logger.begin();
//        ResultMessage message = new ResultMessage();
//        try {
//            // 进行登录验证
//            Subject subject = SecurityUtils.getSubject();
//            //获取登录的用户名密码
//            String userName = request.getUserName();
//            String password = request.getPassword();
//            //生成令牌，此处可以使用令牌来实现记住我的功能
//            UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
//            //token.setRememberMe(true);
//            //认证,
//            subject.login(token);
//            //判断是否通过验证
//            if (subject.isAuthenticated()) {
//                logger.debug("User Login Succeed", userName);
//                message.setCode(CodeConstant.SUCCESS);// 成功的状态码
//                logger.end();
//            }
//        } catch (BusinessException e) {
//            JSONObject json = new JSONObject();
//            message.setCode(e.getErrorCode());
//            message.setCodeDesc(e.getErrorDes());
//            logger.error(e);
//        } catch (Exception e) {
//            message.setCode(CodeConstant.SYSTEM_ERROR);
//            message.setCodeDesc(ResourceUtils.getResultCodeDesc(CodeConstant.SYSTEM_ERROR));
//            logger.error(e);
//        }
//        logger.end();
//        return message;
//    }

}