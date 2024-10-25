package com.cms.controller;

import com.cms.pojo.Manufacture;
import com.cms.service.ManufactureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/manufacture")
public class ManufactureController {

    //controller层调用service层
    @Autowired
    @Qualifier("ManufactureServiceImpl")
    private ManufactureService manufactureService;

    // 获取日志记录器
    private static final Logger logger = LoggerFactory.getLogger(ManufactureController.class);


    //查询全部并且返回到展示界面
    @RequestMapping("/allManufacture")
    public String list(Model model){
        List<Manufacture> list = manufactureService.qureyAllBatchs();
        model.addAttribute("list",list);
        return "manufacture/allManufacture";
    }

    //跳转到增加页面
    @RequestMapping("/toAddManufacture")
    public String toAddManufacture(){
        return "manufacture/addManufacture";
    }

    //添加
    @RequestMapping("/addManufacture")
    public String addManufacture(Manufacture manufacture){
        manufactureService.addBatch(manufacture);
        return "redirect:/manufacture/allManufacture";//重定向到@RequestMapping("/allCable")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int batchnumber,Model model){
        Manufacture manufacture = manufactureService.queryBatchByBatchnumber(batchnumber);
        model.addAttribute("QManufacture",manufacture);
        return "manufacture/updateManufacture";

    }

    //修改
    @RequestMapping("/updateManufacture")
    public String updateManufacture(Manufacture manufacture){
        System.out.println("updataManufacture=="+manufacture);
        manufactureService.updateBatch(manufacture);
        return "redirect:/manufacture/allManufacture";
    }


    //删除
    @RequestMapping("/deleteManufacture")
    public String deleteManufacture(int batchnumber){
        manufactureService.deleteBatchByBatchnumber(batchnumber);
        return "redirect:/manufacture/allManufacture";
    }




}
