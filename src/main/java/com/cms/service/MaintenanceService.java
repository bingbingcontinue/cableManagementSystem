package com.cms.service;

import com.cms.pojo.Maintenance;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaintenanceService {
    //增加一条线缆信息
    int addMaintenance(Maintenance maintenance);

    //删除一条线缆信息
    int deleteMaintenanceById(@Param("id") int id);

    //更新
    int updateMaintenance(Maintenance maintenance);

    //查询
    Maintenance queryMaintenanceById(int id);

    //查询全部
    List<Maintenance> qureyAllMaintenance();

    List<Maintenance> queryMaintenanceByStatus(String status);

    List<Maintenance> queryMaintenanceBycolumn(String queryColumn,String queryParam);


}
