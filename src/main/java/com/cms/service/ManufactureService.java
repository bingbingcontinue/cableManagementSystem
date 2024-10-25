package com.cms.service;

import com.cms.pojo.Manufacture;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ManufactureService {
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
