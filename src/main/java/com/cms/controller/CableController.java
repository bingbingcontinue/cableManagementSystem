package com.cms.controller;

import com.cms.pojo.*;
import com.cms.service.CableService;
import com.cms.service.DrawingsService;
import com.cms.service.InterfaceService;
import com.cms.service.ManufactureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cable")
public class CableController {

    //controller层调用service层
    @Autowired
    @Qualifier("CableServiceImpl")
    private CableService cableService;


    //controller层调用service层
    @Autowired
    @Qualifier("DrawingsServiceImpl")
    private DrawingsService drawingsService;

    //controller层调用service层
    @Autowired
    @Qualifier("ManufactureServiceImpl")
    private ManufactureService manufactureService;

    //controller层调用service层
    @Autowired
    @Qualifier("InterfaceServiceImpl")
    private InterfaceService interfaceService;

    // 获取日志记录器
    private static final Logger logger = LoggerFactory.getLogger(CableController.class);

    //查询全部并且返回到展示界面
    @RequestMapping("/allCable")
    public String list(Model model){
        List<Cable> list = cableService.qureyAllCables();
        model.addAttribute("list",list);
        return "cable/allCable";
    }

    //跳转到增加页面
    @RequestMapping("/toAddCable")
    public String toAddCabel(Model model){
        //todo:需要传递参数,uploadList,downloadList供选择，还有批号，图纸号和系统号;
        List<Drawings> drawList = drawingsService.qureyAllDrawings();
        List<Manufacture> manuList = manufactureService.qureyAllBatchs();
        List<Interface> interList = interfaceService.qureyAllIntfaces();
        model.addAttribute("drawList",drawList);
        model.addAttribute("manuList",manuList);
        model.addAttribute("interList",interList);
        return "cable/addCable";
    }

    //添加
    @RequestMapping("/addCable")
    public String addCable(Cable cable){
        cableService.addCable(cable);
        return "redirect:/cable/allCable";//重定向到@RequestMapping("/allCable")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateCable(int id,Model model){
        Cable cable = cableService.queryCableById(id);
        model.addAttribute("QCables",cable);
        return "cable/updateCable";

    }

    //修改
    @RequestMapping("/updateCable")
    public String updateCable(Cable cable){
        System.out.println("updataCable=="+cable);
        cableService.updateCable(cable);
        return "redirect:/cable/allCable";
    }


    //删除
    @RequestMapping("/deleteCable")
    public String deleteCable(int id){
        cableService.deleteCableById(id);
        return "redirect:/cable/allCable";
    }


    //查询
    @RequestMapping("/queryCable")
    public String queryCable(String queryCableName,Model model){
        List<Cable> list = cableService.queryCableByName(queryCableName);
        //若list为空,表示没有查询到，输出查询结果为空并跳转到开始页面
        if(null == list || list.size() ==0){
            list = cableService.qureyAllCables();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "cable/allCable";
    }

    //查询
    @RequestMapping("/queryCablebycolumn")
    public String queryCablebycolumn(@RequestParam("queryColumn") String queryColumn,
                                     @RequestParam("queryParam") String queryParam,
                                     Model model){
        List<Cable> list = cableService.queryCablebycolumn(queryColumn,queryParam);
        //若list为空,表示没有查询到，输出查询结果为空并跳转到开始页面
        if(null == list || list.size() ==0){
            list = cableService.qureyAllCables();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "cable/allCable";
    }

    //多表联查，获取测试信息、故障维护信息、安装信息
    @RequestMapping("/queryCableTestComplex")
    public String queryCableTestComplex(int cableID,Model model){
        Cable cabletest = cableService.getCableTestComplex(cableID);
        List<Test> test = cabletest.getTestInfo();
        model.addAttribute("cabletest",test);
        System.out.println(test);
        Cable cablemaintenance = cableService.getCableMaintenanceComplex(cableID);
        List<Maintenance> maintenance = cablemaintenance.getMaintenanceList();
        model.addAttribute("cablemaintenance",maintenance);
        System.out.println(maintenance);
        Cable cableinstallation = cableService.getCableInstallComplex(cableID);
        List<Installation> installation = cableinstallation.getInstallationList();
        model.addAttribute("cableinstallation",installation);
        System.out.println(installation);
        return "cable/complexQuery";
    }
    //一对一查询，获取接口信息
    @RequestMapping("/queryCableIntface")
    public String queryCableInterface(int interfaceID,Model model){
        Interface intface = interfaceService.queryIntfaceById(interfaceID);
        List<Interface> list = new ArrayList<Interface>();
        list.add(intface);
        model.addAttribute("list",list);
        System.out.println(intface);
        return "interface/allInterface";
    }
    //一对多查询，获取生产信息
    @RequestMapping("/queryCableManufacture")
    public String queryCableManufacture(int batchnumber,Model model){
        Manufacture manufacture = manufactureService.queryBatchByBatchnumber(batchnumber);
        List<Manufacture> list = new ArrayList<Manufacture>();
        list.add(manufacture);
        model.addAttribute("list",list);
        System.out.println(manufacture);
        return "manufacture/allManufacture";
    }
    //一对多查询，获取图纸信息
    @RequestMapping("/queryCableDrawing")
    public String queryCableDrawing(int drawingID,Model model){
        Drawings drawings = drawingsService.queryDrawingsById(drawingID);
        List<Drawings> list = new ArrayList<Drawings>();
        list.add(drawings);
        model.addAttribute("drawings",list);
        System.out.println(drawings);
        return "drawings/allDrawings";
    }
}
