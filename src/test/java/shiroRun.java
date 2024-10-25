import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.mgt.SecurityManager;
import org.junit.Test;

/**
 * @Author：bingfeng
 * @Date：2024/10/24 10:45
 */
public class shiroRun {
    @Test
    public void shirotest(){
        //1 初始化获取安全管理器SecurityManager
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //2 获取主体对象Subject
        Subject subject = SecurityUtils.getSubject();
        //3 模拟token对象，web应用用户名和密码从页面传递
        AuthenticationToken token = new UsernamePasswordToken("zhangsan","z3");
        //4 完成登录 调用login方法，传入token
        try{
            subject.login(token);
            System.out.println("登陆成功");
            //5 登录成功后，判断角色
            boolean hasRole = subject.hasRole("role1");
            System.out.println("是否拥有此角色"+hasRole);
            //6 判断权限
            boolean permitted = subject.isPermitted("user:insert");
            System.out.println("是否拥有此权限"+permitted);
        }catch (UnknownAccountException e){
            e.printStackTrace();
            System.out.println("账户不存在");
        }catch (IncorrectCredentialsException e){
//            e.printStackTrace();
            System.out.println("密码错误");
        }catch (AuthenticationException e){
            e.printStackTrace();
        }
    }
}
