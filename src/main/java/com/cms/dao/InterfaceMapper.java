package com.cms.dao;

import com.cms.pojo.Interface;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterfaceMapper {

    //增加一个端口信息
    int addIntface(Interface intface);

    //删除
    int deleteIntfaceById(@Param("interfaceID") int interfaceID);

    //更新
    int updateIntface(Interface intface);

    //查询
    Interface queryIntfaceById(int interfaceID);

    //查询全部
    List<Interface> qureyAllIntfaces();

}
