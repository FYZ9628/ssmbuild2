package com.fyz.service;

import com.fyz.pojo.Books;
import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Books books);

    //根据id删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //根据id查询,返回一本书
    Books queryBookById(int id);

    //查询全部书,返回list集合
    List<Books> queryAllBook();

    Books queryBookByName(String bookName);


}