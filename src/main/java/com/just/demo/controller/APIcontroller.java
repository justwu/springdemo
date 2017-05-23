package com.just.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by flyhigh on 2017/5/23.
 */
@RestController //所有数据都已json格式进行返回
public class APIcontroller {


    @RequestMapping(value = "/booklist")
    public String booklist() {
        return "booklist result";
    }

}
