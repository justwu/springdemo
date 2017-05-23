package com.just.demo.test;

import com.just.demo.config.Jconfig;
import com.just.demo.service.UserShoppingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by flyhigh on 2017/5/21.
 */
public class Testrun {

    public static  void  main(String[] args){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Jconfig.class);
        UserShoppingService service=context.getBean(UserShoppingService.class);
        System.out.println("!!! start");
        service.buy("aa");
     /*   service.buy("aa");
        service.buy("bb");*/
        service.printlist();
        System.out.println("!!! end");


        context.close();


    }
}
