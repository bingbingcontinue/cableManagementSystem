package com.cms.dao;
import com.cms.pojo.Test;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    int addTest(Test test);
    int deleteTestBycableId(@Param("cableID") int cableID);
    int updateTest(Test test);
    Test queryTestBycableId(int cableID);
    List<Test> qureyAllTest();

}
