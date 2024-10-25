package com.cms.controller;

import com.cms.pojo.Drawings;
import com.cms.service.DrawingsService;
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
@RequestMapping("/drawings")
public class DrawingsController {

    //controller层调用service层
    @Autowired
    @Qualifier("DrawingsServiceImpl")
    private DrawingsService drawingsService;

    // 获取日志记录器
    private static final Logger logger = LoggerFactory.getLogger(DrawingsController.class);

    //查询全部并且返回到展示界面
    @RequestMapping("/allDrawings")
    public String list(Model model){
        List<Drawings> list = drawingsService.qureyAllDrawings();
        model.addAttribute("list",list);
        return "drawings/allDrawings";
    }

    //跳转到增加页面
    @RequestMapping("/toAddDrawings")
    public String toAddDrawings(){
        return "drawings/addDrawings";
    }

    //添加请求
    @RequestMapping("/addDrawings")
    public String addDrawings(Drawings drawings){
        drawingsService.addDrawings(drawings);
        return "redirect:/drawings/allDrawings";//重定向到@RequestMapping("/allBook")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateDrawings(int drawingID,Model model){
        Drawings drawings=drawingsService.queryDrawingsById(drawingID);
        model.addAttribute("QDrawings",drawings);
        return "drawings/updateDrawings";

    }

    //修改
    @RequestMapping("/updateDrawings")
    public String updateDrawings(Drawings drawings){
        System.out.println("updataDrawings=="+drawings);
        drawingsService.updateDrawings(drawings);
        return "redirect:/drawings/allDrawings";
    }


    //删除
    @RequestMapping("/deleteDrawings")
    public String deleteDrawings(int drawingID){
        drawingsService.deleteDrawingsById(drawingID);
        return "redirect:/drawings/allDrawings";
    }

    //查询
    @RequestMapping("/queryDrawings")
    public String queryDrawings(@RequestParam("queryColumn") String queryColumn,
                                @RequestParam("queryParam") String queryParam,
                                Model model) {
        // 根据用户选择的列和输入的查询条件进行查询
        List<Drawings> list = drawingsService.queryDrawingsByColumn(queryColumn, queryParam);
        model.addAttribute("list", list);
        return "drawings/allDrawings"; // 返回 JSP 页面
    }



}
