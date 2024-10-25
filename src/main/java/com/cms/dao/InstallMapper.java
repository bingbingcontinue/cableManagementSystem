package com.cms.dao;

import com.cms.pojo.Installation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstallMapper {

    //增加一条线缆信息
    int addInstallation(Installation install);

    //删除一条线缆信息
    int deleteInstallationById(@Param("cableID") int cableID);

    //更新
    int updateInstallation(Installation install);

    //查询
    Installation queryInstallationById(int cableID);

    //查询全部
    List<Installation> qureyAllInstallations();

}
