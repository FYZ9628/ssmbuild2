package com.fyz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//这是偷懒的方法
//在pom文件中添加了 Lombok 依赖
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}

//下面是方法二
//package com.fyz.pojo;
//
////@Data  //除了有参构造，其他都有
////@AllArgsConstructor //加入有参构造，但无参没了
////@NoArgsConstructor  //加入无参
//public class Books {
//    private int bookID;
//    private String bookName;
//    private int bookCounts;
//    private String detail;
//
//    @Override
//    public String toString() {
//        return "Books{" +
//                "bookID=" + bookID +
//                ", bookName='" + bookName + '\'' +
//                ", bookCounts=" + bookCounts +
//                ", detail='" + detail + '\'' +
//                '}';
//    }
//
//    public Books() {
//    }
//
//    public Books(int bookID, String bookName, int bookCounts, String detail) {
//        this.bookID = bookID;
//        this.bookName = bookName;
//        this.bookCounts = bookCounts;
//        this.detail = detail;
//    }
//
//    public int getBookID() {
//        return bookID;
//    }
//
//    public void setBookID(int bookID) {
//        this.bookID = bookID;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public int getBookCounts() {
//        return bookCounts;
//    }
//
//    public void setBookCounts(int bookCounts) {
//        this.bookCounts = bookCounts;
//    }
//
//    public String getDetail() {
//        return detail;
//    }
//
//    public void setDetail(String detail) {
//        this.detail = detail;
//    }
//}
