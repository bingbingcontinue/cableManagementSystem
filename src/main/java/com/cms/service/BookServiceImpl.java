package com.cms.service;

import java.util.List;

import com.cms.dao.BookMapper;
import com.cms.pojo.Books;


public class BookServiceImpl implements BookService{

    //service调dao层：组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> qureyAllBook() {
        return bookMapper.qureyAllBook();
    }

//    @Override
//    public Books queryBookByName(String bookName) {
//        return bookMapper.queryBookByName(bookName);
//    }

    @Override
    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
