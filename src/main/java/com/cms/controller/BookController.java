package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cms.pojo.Books;
import com.cms.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    //controller层调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书籍并且返回到书籍展示界面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.qureyAllBook();
        model.addAttribute("list",list);
        return "demo/allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "demo/addBook";
    }

    //添加书籍请求
    @RequestMapping("/addBook")
    public String addPaper(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";//重定向到@RequestMapping("/allBook")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBooks",books);
        return "demo/updateBook";

    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updataBook=="+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }


    //删除书籍
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }


    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){

        List<Books> list = bookService.queryBookByName(queryBookName);

        //若list为空,表示没有查询到，输出查询结果为空并跳转到开始页面
        if(null == list || list.size() ==0){
            list = bookService.qureyAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "demo/allBook";

    }


}
