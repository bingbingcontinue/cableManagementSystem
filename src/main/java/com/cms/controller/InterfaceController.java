package com.cms.controller;

import com.cms.pojo.Interface;
import com.cms.service.InterfaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/interface")
public class InterfaceController {

    //controller层调用service层
    @Autowired
    @Qualifier("InterfaceServiceImpl")
    private InterfaceService interfaceService;

    // 获取日志记录器
    private static final Logger logger = LoggerFactory.getLogger(InterfaceController.class);

    //查询全部并且返回到展示界面
    @RequestMapping("/allInterface")
    public String list(Model model){
        List<Interface> list = interfaceService.qureyAllIntfaces();
        model.addAttribute("list",list);
        return "interface/allInterface";
    }



    //跳转到增加页面
    @RequestMapping("/toAddInterface")
    public String toAddInterface(){
        return "interface/addInterface";
    }

    //添加
    @RequestMapping("/addInterface")
    public String addInterface(Interface intface){
        interfaceService.addIntface(intface);
        return "redirect:/interface/allInterface";//重定向到@RequestMapping("/allCable")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateInterface(int id,Model model){
        Interface intface = interfaceService.queryIntfaceById(id);
        model.addAttribute("QInterface",intface);
        return "interface/updateInterface";

    }

    //修改
    @RequestMapping("/updateInterface")
    public String updateInterface(Interface intface){
        System.out.println("updataInterface=="+intface);
        interfaceService.updateIntface(intface);
        return "redirect:/interface/allInterface";
    }


    //删除
    @RequestMapping("/deleteInterface")
    public String deleteInterface(int id){
        interfaceService.deleteIntfaceById(id);
        return "redirect:/interface/allInterface";
    }


}
