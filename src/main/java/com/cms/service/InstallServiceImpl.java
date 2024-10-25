package com.cms.service;

import com.cms.dao.InstallMapper;
import com.cms.pojo.Installation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstallServiceImpl implements InstallService{

    //service调dao层：组合Dao
    private InstallMapper installMapper;
    public void setInstallMapper(InstallMapper installMapper) {
        this.installMapper = installMapper;
    }
    @Override
    public int addInstallation(Installation install) {
        return installMapper.addInstallation(install);
    }
    @Override
    public int deleteInstallationById(int cableID) {
        return installMapper.deleteInstallationById(cableID);
    }
    @Override
    public int updateInstallation(Installation install) {
        return installMapper.updateInstallation(install);
    }
    @Override
    public Installation queryInstallationById(int cableID) {
        return installMapper.queryInstallationById(cableID);
    }
    @Override
    public List<Installation> qureyAllInstallations() {
        return installMapper.qureyAllInstallations();
    }
}
