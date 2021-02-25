package com.fyz.service;

import com.fyz.dao.BookMapper;
import com.fyz.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

//不加Service也可以运行
//@Service
public class BookServiceImpl implements BookService{

    //Service调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
//        System.out.println("bsimpl_>updateBook=="+books);
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}