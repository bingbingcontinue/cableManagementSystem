package com.cms.service;

import com.cms.pojo.Test;

import java.util.List;

public interface TestService {
    int addTest(Test test);
    int deleteTestBycableId(int cableID);
    int updateTest(Test test);
    Test queryTestBycableId(int cableID);
    List<Test> qureyAllTest();
}
