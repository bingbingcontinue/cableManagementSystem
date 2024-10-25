package com.cms.service;

import com.cms.dao.ManufactureMapper;
import com.cms.pojo.Manufacture;

import java.util.List;


public class ManufactureServiceImpl implements ManufactureService {

    //service调dao层：组合Dao
    private ManufactureMapper manufactureMapper;

    public void setManufactureMapper(ManufactureMapper manufactureMapper) {
        this.manufactureMapper = manufactureMapper;
    }

    @Override
    public int addBatch(Manufacture manufacture) {
        return manufactureMapper.addBatch(manufacture);
    }

    @Override
    public int deleteBatchByBatchnumber(int batchnumber) {
        return manufactureMapper.deleteBatchByBatchnumber(batchnumber);
    }

    @Override
    public int updateBatch(Manufacture manufacture) {
        return manufactureMapper.updateBatch(manufacture);
    }

    @Override
    public Manufacture queryBatchByBatchnumber(int batchnumber) {
        return manufactureMapper.queryBatchByBatchnumber(batchnumber);
    }

    @Override
    public List<Manufacture> qureyAllBatchs() {
        return manufactureMapper.qureyAllBatchs();
    }

}
