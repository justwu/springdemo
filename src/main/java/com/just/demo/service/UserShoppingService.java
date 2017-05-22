package com.just.demo.service;

import com.just.demo.pojo.Shoppingcar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.soap.addressing.server.annotation.Action;

/**
 * Created by flyhigh on 2017/5/22.
 */
@Service
public class UserShoppingService {
    @Autowired
    private Shoppingcar shoppingcar;

    public String buy(String bookname){
        return shoppingcar.buy(bookname);
    }

    public String delete(String bookname){
        return shoppingcar.delete(bookname);
    }

    public String printlist(){
        return shoppingcar.printlist();
    }



}
