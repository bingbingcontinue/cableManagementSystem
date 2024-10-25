package com.cms.service;

import com.cms.dao.InterfaceMapper;
import com.cms.pojo.Interface;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public class InterfaceServiceImpl implements InterfaceService{

    //service调dao层：组合Dao
    private InterfaceMapper interfaceMapper;

    public void setInterfaceMapper(InterfaceMapper interfaceMapper) {
        this.interfaceMapper = interfaceMapper;
    }

    @Override
    public int addIntface(Interface intface) {
        return interfaceMapper.addIntface(intface);
    }

    @Override
    public int deleteIntfaceById(int interfaceID) {
        return interfaceMapper.deleteIntfaceById(interfaceID);
    }

    @Override
    public int updateIntface(Interface intface) {
        return interfaceMapper.updateIntface(intface);
    }

    @Override
    public Interface queryIntfaceById(int interfaceID) {
        return interfaceMapper.queryIntfaceById(interfaceID);
    }

    @Override
    public List<Interface> qureyAllIntfaces() {
        return interfaceMapper.qureyAllIntfaces();
    }


}
