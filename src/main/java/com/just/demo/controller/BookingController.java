package com.just.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by flyhigh on 2017/5/23.
 */
@Controller
public class BookingController {

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg() {

        return "reg";
    }

}
