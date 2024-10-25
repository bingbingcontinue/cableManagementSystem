package com.cms.controller;

import com.cms.pojo.*;
import com.cms.service.CableService;
import com.cms.service.MaintenanceService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/maintenance")
public class MaintenanceController {

    //controller层调用service层
    @Autowired
    @Qualifier("MaintenanceServiceImpl")
    private MaintenanceService maintenanceService;
    @Autowired
    @Qualifier("CableServiceImpl")
    private CableService cableService;
    // 获取日志记录器
    private static final Logger logger = LoggerFactory.getLogger(MaintenanceController.class);

    //查询全部并且返回到展示界面
    @RequestMapping("/allMaintenance")
    public String list(Model model){
        List<Maintenance> list = maintenanceService.qureyAllMaintenance();
        model.addAttribute("list",list);
        return "maintenance/allMaintenance";
    }

//    //跳转到增加页面
//    @RequestMapping("/toAddMaintenance")
//    public String toAddMaintenance(){
//        return "maintenance/addMaintenance";
//    }

    //添加
    @RequestMapping("/addMaintenance")
    public String addMaintenance(Maintenance maintenance){
        maintenanceService.addMaintenance(maintenance);
        return "redirect:/maintenance/allMaintenance";//重定向到@RequestMapping("/allCable")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateMaintenance(int id,Model model){
        Maintenance maintenance=maintenanceService.queryMaintenanceById(id);
        model.addAttribute("QMaintenance",maintenance);
        return "maintenance/updateMaintenance";

    }

    //修改
    @RequestMapping("/updateMaintenance")
    public String updateMaintenance(Maintenance maintenance){
        System.out.println("updataMaintenance=="+maintenance);
        maintenanceService.updateMaintenance(maintenance);
        return "redirect:/maintenance/allMaintenance";
    }


    //删除
    @RequestMapping("/deleteMaintenance")
    public String deleteMaintenance(int id){
        maintenanceService.deleteMaintenanceById(id);
        return "redirect:/maintenance/allMaintenance";
    }


    //查询
    @RequestMapping("/queryMaintenance")
    public String queryMaintenancebyStatus(String queryMaintenanceStatus,Model model){

        List<Maintenance> list = maintenanceService.queryMaintenanceByStatus(queryMaintenanceStatus);

        //若list为空,表示没有查询到，输出查询结果为空并跳转到开始页面
        if(null == list || list.size() ==0){
            list = maintenanceService.qureyAllMaintenance();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "maintenance/allMaintenance";

    }

    @RequestMapping("/queryMaintenancebycolumn")
    public String queryMaintenancebycolumn(@RequestParam("queryColumn")String queryColumn,
                                           @RequestParam("queryParam")String queryParam,
                                           Model model) {
        List<Maintenance> list = maintenanceService.queryMaintenanceBycolumn(queryColumn, queryParam);
        model.addAttribute("list", list);
        return "maintenance/allMaintenance";
    }

    //跳转到增加页面
    @RequestMapping("/toAddMaintenance")
    public String toAddCabel(Model model){
        //todo:需要传递参数,uploadList,downloadList供选择，还有批号，图纸号和系统号;
        List<Cable> cableList = cableService.qureyAllCables();
        model.addAttribute("cableList",cableList);
        return "maintenance/addMaintenance";
    }

}
