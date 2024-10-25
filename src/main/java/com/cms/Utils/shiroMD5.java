package com.cms.Utils;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @Author：bingfeng
 * @Date：2024/10/24 15:57
 */
public class shiroMD5 {
    public static void main(String[] args) {
        //密码明文
        String password = "z3";
        //使用MD5加密
        Md5Hash md5Hash = new Md5Hash(password);
        System.out.println("md5加密后的结果为:" + md5Hash.toHex());//a61d1457beb4684e254ce60379c8ae7b
        //使用MD5加盐加密,就是在密码明文后面加上一个字符串，然后再进行MD5加密
        Md5Hash md5Hash1 = new Md5Hash(password, "salt");
        System.out.println("md5加盐加密后的结果为:" + md5Hash1.toHex()) ;//dd4611daf1e40eff99b9fdcadbd22674
        //多次Md5加密更安全
        Md5Hash md5Hash2 = new Md5Hash(password, "salt", 3);//3表示加密3次
        System.out.println("md5多次加密后的结果为:" + md5Hash2.toHex());//7174f64b13022acd3c56e2781e098a5f

        //使用父类进行加密
        SimpleHash simpleHash = new SimpleHash("MD5", password, "salt", 3);
        System.out.println("使用父类进行加密的结果为:" + simpleHash.toHex());//7174f64b13022acd3c56e2781e098a5f
    }
}
