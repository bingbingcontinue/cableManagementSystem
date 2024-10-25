package com.cms.service;

import com.cms.pojo.Cable;
import com.cms.pojo.Drawings;
import com.cms.pojo.Interface;
import com.cms.pojo.Manufacture;

import java.util.List;

public interface CableService {
    int addCable(Cable cable);
    int deleteCableById(int id);
    int updateCable(Cable cable);
    Cable queryCableById(int id);
    List<Cable> qureyAllCables();
    List<Cable> queryCableByName(String cablename);

    //多表联查
    Cable getCableTestComplex(int cableID); //取测试表
    Cable getCableMaintenanceComplex(int cableID);//取故障维护表
    Cable getCableInstallComplex(int cableID);//取安装表
    Cable getCableDrawingsComplex(int drawingsID);//取图纸表
    Cable getCableIntfaceComplex(int interfaceID);//取接口表
    Cable getCableManufactureComplex(int batchnumber);//取生产信息表
    List<Cable> queryCablebycolumn(String queryColumn,String queryParam);

}
