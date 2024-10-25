package com.cms.service;

import java.util.List;

import com.cms.pojo.Books;


public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书
    List<Books> qureyAllBook();

    //根据书名查询对应书籍书
    List<Books> queryBookByName(String bookName);

}
