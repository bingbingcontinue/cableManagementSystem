package com.cms.service;

import com.cms.dao.CableMapper;
import com.cms.pojo.Cable;
import com.cms.pojo.Drawings;
import com.cms.pojo.Interface;
import com.cms.pojo.Manufacture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CableServiceImpl implements CableService{

    //service调dao层：组合Dao
    private CableMapper cableMapper;

    public void setCableMapper(CableMapper cableMapper) {
        this.cableMapper = cableMapper;
    }

    @Override
    public int addCable(Cable cable) {
        return cableMapper.addCable(cable);
    }

    @Override
    public int deleteCableById(int id) {
        return cableMapper.deleteCableById(id);
    }

    @Override
    public int updateCable(Cable cable) {
        return cableMapper.updateCable(cable);
    }

    @Override
    public Cable queryCableById(int id) {
        return cableMapper.queryCableById(id);
    }

    @Override
    public List<Cable> qureyAllCables() {
        return cableMapper.qureyAllCables();
    }
    @Override
    public List<Cable> queryCableByName(String cablename) {
        return cableMapper.queryCableByName(cablename);
    }

    @Override
    public Cable getCableTestComplex(int cableID) {
        return cableMapper.getCableTestComplex(cableID);
    }
    @Override
    public Cable getCableMaintenanceComplex(int cableID) {
        return cableMapper.getCableMaintenanceComplex(cableID);
    }
    @Override
    public Cable getCableInstallComplex(int cableID) {
        return cableMapper.getCableInstallComplex(cableID);
    }
    @Override
    public Cable getCableDrawingsComplex(int drawingsID) {
        return cableMapper.getCableDrawingsComplex(drawingsID);
    }
    @Override
    public Cable getCableIntfaceComplex(int interfaceID){
        return cableMapper.getCableIntfaceComplex(interfaceID);
    }
    @Override
    public Cable getCableManufactureComplex(int batchnumber){
        return cableMapper.getCableManufactureComplex(batchnumber);
    }
    @Override
    public List<Cable> queryCablebycolumn(String queryColumn, String queryParam) {
        return cableMapper.queryCablebycolumn(queryColumn,queryParam);
    }

}
