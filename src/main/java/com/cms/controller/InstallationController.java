package com.cms.controller;

import com.cms.pojo.Cable;
import com.cms.pojo.Installation;
import com.cms.service.CableService;
import com.cms.service.InstallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/install")
public class InstallationController {

    //controller层调用service层
    @Autowired
    @Qualifier("InstallServiceImpl")
    private InstallService installService;
    @Autowired
    @Qualifier("CableServiceImpl")
    private CableService cableService;

    // 获取日志记录器
    private static final Logger logger = LoggerFactory.getLogger(InstallationController.class);

    //查询全部并且返回到展示界面
    @RequestMapping("/allInstall")
    public String list(Model model){
        List<Installation> list = installService.qureyAllInstallations();
        model.addAttribute("list",list);
        return "install/allInstall";
    }

    //跳转到增加页面
    @RequestMapping("/toAddInstall")
    public String toAddInstall(Model model){
        List<Cable> list = cableService.qureyAllCables();
        model.addAttribute("list",list);
        return "install/addInstall";
    }

    //添加
    @RequestMapping("/addInstall")
    public String addInstall(Installation install){
        installService.addInstallation(install);
        return "redirect:/install/allInstall";//重定向到@RequestMapping("/allCable")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateInstall(int cableID,Model model){
        Installation installation = installService.queryInstallationById(cableID);
        model.addAttribute("QInstalls",installation);
        return "install/updateInstall";

    }

    //修改
    @RequestMapping("/updateInstall")
    public String updateInstall(Installation install){
        System.out.println("updataInstall=="+install);
        installService.updateInstallation(install);
        return "redirect:/install/allInstall";
    }


    //删除
    @RequestMapping("/deleteInstall")
    public String deleteInstall(int cableID){
        installService.deleteInstallationById(cableID);
        return "redirect:/install/allInstall";
    }

}
