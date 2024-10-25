package com.cms.service;

import com.cms.pojo.Interface;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InterfaceService {
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
