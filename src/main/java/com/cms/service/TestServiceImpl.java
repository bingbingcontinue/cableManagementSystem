package com.cms.service;

import com.cms.dao.TestMapper;
import com.cms.pojo.Test;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    //service调dao层：组合Dao
    private TestMapper testMapper;

    public void setTestMapper(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public  int addTest(Test test){
        return testMapper.addTest(test);
    };
    @Override
    public int deleteTestBycableId(int cableID){return testMapper.deleteTestBycableId(cableID);}
    @Override
    public int updateTest(Test test){return testMapper.updateTest(test);}
    @Override
    public Test queryTestBycableId(int cableID){
        return testMapper.queryTestBycableId(cableID);
    }
    @Override
    public List<Test> qureyAllTest(){
        return testMapper.qureyAllTest();
    };
}
