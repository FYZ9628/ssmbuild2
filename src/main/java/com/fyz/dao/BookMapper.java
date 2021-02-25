package com.fyz.dao;

import com.fyz.pojo.Books;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(Books books);

    //根据id删除一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBook(Books books);

    //根据id查询,返回一本书
    Books queryBookById(@Param("bookId") int id);

    //查询全部的书，返回list集合
    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName") String bookName);

}