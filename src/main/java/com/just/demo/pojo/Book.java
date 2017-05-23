package com.just.demo.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by flyhigh on 2017/5/21.
 */
@Component
public class Book {

    private String bookname;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }


    public void showContent() {
        System.out.println("书的内容:");
    }

}
