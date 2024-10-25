package com.cms.dao;

import com.cms.pojo.Manufacture;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ManufactureMapper {

    //增加一批次信息
    int addBatch(Manufacture manufacture);

    //删除某一批次信息
    int deleteBatchByBatchnumber(@Param("batchnumber") int batchnumber);

    //更新一批次信息
    int updateBatch(Manufacture manufacture);

    //通过批号查询
    Manufacture queryBatchByBatchnumber(int batchnumber);

    //查询全部
    List<Manufacture>qureyAllBatchs();


}
