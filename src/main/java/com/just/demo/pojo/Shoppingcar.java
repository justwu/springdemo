package com.just.demo.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by flyhigh on 2017/5/21.
 *
 */
@Component
//@Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)
@Scope(value ="prototype")
public class Shoppingcar {

      private HashMap<String,Integer> cars=new HashMap<String,Integer>();

      public String buy(String bookname){
          if(cars.containsKey(bookname)){
              cars.put(bookname,cars.get(bookname)+1);
          }else {
              cars.put(bookname,1);
          }
          return "OK";
      }

     public String delete(String bookname){
         if(cars.containsKey(bookname)) {
             cars.put(bookname, cars.get(bookname) - 1);
             if(cars.get(bookname)==0){
                 cars.remove(bookname);
             }
         }
         return "OK";
     }

    public String printlist(){
        String liststr="";
        for (Map.Entry<String, Integer> entry : cars.entrySet()) {
                String row=MessageFormat.format("book:{0},count:{1}",entry.getKey(),entry.getValue());
                liststr+=liststr.isEmpty()?row:"\n"+row;
        }
        System.out.println(liststr);
        return liststr;
    }


}
