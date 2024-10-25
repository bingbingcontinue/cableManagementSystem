package com.cms.controller;

import com.cms.pojo.Cable;
import com.cms.pojo.Test;
import com.cms.service.CableService;
import com.cms.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    //controller层调用service层
    @Autowired
    @Qualifier("TestServiceImpl")
    private TestService testService;

    @Autowired
    @Qualifier("CableServiceImpl")
    private CableService cableService;
    // 获取日志记录器
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    //查询全部并且返回到展示界面
    @RequestMapping("/allTest")
    public String list(Model model){
        List<Test> list = testService.qureyAllTest();
        model.addAttribute("list",list);
        return "test/allTest";
    }

    //跳转到增加页面
    @RequestMapping("/toAddTest")
    public String toAddTest(Model model){
        List<Cable> cableList = cableService.qureyAllCables();
        model.addAttribute("list",cableList);
        return "test/addTest";
    }

    //添加
    @RequestMapping("/addTest")
    public String addTest(Test test){
        testService.addTest(test);
        return "redirect:/test/allTest";//重定向到@RequestMapping("/allCable")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateTest(int cableID,Model model){
        Test test = testService.queryTestBycableId(cableID);
        model.addAttribute("QTest",test);
        return "test/updateTest";

    }

    //修改
    @RequestMapping("/updateTest")
    public String updateTest(Test test){
        System.out.println("updataTest=="+test);
        testService.updateTest(test);
        return "redirect:/test/allTest";
    }


    //删除
    @RequestMapping("/deleteTest")
    public String deleteTest(int cableID){
        testService.deleteTestBycableId(cableID);
        return "redirect:/test/allTest";
    }




}
