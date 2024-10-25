package com.cms.dao;

import com.cms.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CableMapper {

    //增加一条线缆信息
    int addCable(Cable cable);

    //删除一条线缆信息
    int deleteCableById(@Param("cableID") int cableID);

    //更新
    int updateCable(Cable cable);

    //查询
    Cable queryCableById(int cableID);

    //查询全部
    List<Cable>qureyAllCables();

    List<Cable> queryCableByName(String cablename);

    Cable getCableTestComplex(int cableID);
    Cable getCableMaintenanceComplex(int cableID);
    Cable getCableInstallComplex(int cableID);
    Cable getCableDrawingsComplex(int drawingsID);
    Cable getCableIntfaceComplex(int interfaceID);
    Cable getCableManufactureComplex(int batchnumber);
    List<Cable> queryCablebycolumn(@Param("queryColumn") String queryColumn, @Param("queryParam") String queryParam);

}
