package com.cms.Utils;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;


    public class MyRealm extends AuthorizingRealm {
        @Override
        protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
            String username = (String) principals.getPrimaryPrincipal();
            SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
            // 在此根据用户名查询角色和权限，并添加到 authorizationInfo 中
            if ("zhangsan".equals(username)) {
                authorizationInfo.addRole("role1");
                authorizationInfo.addStringPermission("user:insert");
                authorizationInfo.addStringPermission("user:select");
            }
            return authorizationInfo;
        }

        @Override
        protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
            String username = (String) token.getPrincipal();
            String password = (String) token.getCredentials();
            // 在此根据用户名查询密码进行验证
            if ("zhangsan".equals(username)) {
                // 这里使用 MD5 哈希值比较
                return new SimpleAuthenticationInfo(username, "7174f64b13022acd3c56e2781e098a5f", getName());
            }
            throw new AuthenticationException("用户不存在");
        }
    }














//    public class MyRealm extends AuthenticatingRealm {


    //自定义登录认证方法，shiro的login方法底层会调用该类的认证方法进行认证
    //配置自定义的realm生效，在shiro.ini文件中配置，或者在springboot中进行配置
    //该方法只是获取进行对比的信息，认证逻辑还是按照shiro底层的逻辑进行的
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        //1 获取身份信息
//        String username = token.getPrincipal().toString();
//        //2 获取凭证信息
//        String password = new String((char[])token.getCredentials());//为什么要转换成字符串？
//        System.out.println("username:" + username);
//        System.out.println("password:" + password);
//        //3 获取数据库中的用户信息
//        if(username.equals("zhangsan")){
//            //3.1数据库中存储的加盐多次加密的密码
//            String password_db = "7174f64b13022acd3c56e2781e098a5f";
//            //4 创建封装校验逻辑对象，封装数据返回
//            AuthenticationInfo info = new SimpleAuthenticationInfo(
//                    token.getPrincipal(),//身份信息
//                    password_db,//凭证信息
//                    ByteSource.Util.bytes("salt"),//盐
//                    token.getPrincipal().toString()//realmName
//                    );
//            return info;
//        }
//
//        // 实际应用中，应该从数据库中查询用户
//        if ("zhangsan".equals(username) && "z3".equals(password)) {
//            return new SimpleAuthenticationInfo(username, password, getName());
//        } else {
//            throw new AuthenticationException("Invalid credentials");
//        }
//
//    }

//}

