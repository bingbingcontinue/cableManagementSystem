package com.cms.service;



import com.cms.dao.MaintenanceMapper;
import com.cms.pojo.Maintenance;
import org.springframework.stereotype.Service;

import java.util.List;


public class MaintenanceServiceImpl implements  MaintenanceService{
    private MaintenanceMapper maintenanceMapper;
    public void setMaintenanceMapper(MaintenanceMapper maintenanceMapper) {
        this.maintenanceMapper = maintenanceMapper;
    }
    @Override
    public int addMaintenance(Maintenance maintenance){
        return maintenanceMapper.addMaintenance(maintenance);
    };
    @Override
    public int deleteMaintenanceById(int id){
        return maintenanceMapper.deleteMaintenanceById(id);
    };
    @Override
    public int updateMaintenance(Maintenance maintenance){
        return maintenanceMapper.updateMaintenance(maintenance);
    };
    @Override
    public Maintenance queryMaintenanceById(int id){
        return maintenanceMapper.queryMaintenanceById(id);
    };
    @Override
    public List<Maintenance> qureyAllMaintenance(){
        return maintenanceMapper.qureyAllMaintenance();
    };
    @Override
    public List<Maintenance> queryMaintenanceByStatus(String status){
        return maintenanceMapper.queryMaintenanceByStatus(status);
    };
    @Override
    public List<Maintenance> queryMaintenanceBycolumn(String queryColumn,String queryParam){
        return maintenanceMapper.queryMaintenanceBycolumn(queryColumn,queryParam);
    }


}
