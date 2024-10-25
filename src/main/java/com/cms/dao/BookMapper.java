package com.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cms.pojo.Books;


public interface BookMapper {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookID") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书
    List<Books>qureyAllBook();

    //根据书名查询书籍
    List<Books> queryBookByName(String bookName);

}
