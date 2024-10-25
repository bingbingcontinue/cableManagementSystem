package com.cms.dao;

//import com.cms.pojo.Cable;
import com.cms.pojo.Maintenance;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MaintenanceMapper {

    //增加一条线缆信息
    int addMaintenance(Maintenance maintenance);

    //删除一条线缆信息
    int deleteMaintenanceById(@Param("id") int id);

    //更新
    int updateMaintenance(Maintenance maintenance);

    //查询
    Maintenance queryMaintenanceById(@Param("id") int id);

    //查询全部
    List<Maintenance> qureyAllMaintenance();

    List<Maintenance> queryMaintenanceByStatus(String status);
    List<Maintenance> queryMaintenanceBycolumn(@Param("queryColumn") String queryColumn,@Param("queryParam") String queryParam);



}
