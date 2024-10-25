package com.cms.service;

import com.cms.pojo.Installation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InstallService {
    int addInstallation(Installation install);

    //删除一条线缆信息
    int deleteInstallationById(int cableID);

    //更新
    int updateInstallation(Installation install);

    //查询
    Installation queryInstallationById(int cableID);

    //查询全部
    List<Installation> qureyAllInstallations();

}
