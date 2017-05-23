package com.just.demo.inject;

import com.just.demo.service.imp.OpBean;
import com.just.demo.service.local.OpLocal;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by flyhigh on 2017/5/22.
 */
@Aspect
@Component
public class Buyinjecter {//这是一个切面类
    Logger logger = Logger.getLogger(Buyinjecter.class);

    @Pointcut("execution(* com.just.demo.service.UserShoppingService.buy(..))&&args(bookname)")//定义切点
    public void testcut(String bookname) {

    }

    @DeclareParents(value = "com.just.demo.pojo.Book", defaultImpl = OpBean.class)
    public OpLocal opLocal;//让Book 拥有opLocal的功能

    @Before("testcut(bookname)")
    public void beforebuy(String bookname) { //方法调用之前执行
//        logger.info(this.getClass().getSimpleName()+"excute  beforebuy");
    }


    @After("testcut(bookname)")
    public void afterbuy(String bookname) {//在返回或者抛出异常之后执行
//        logger.info(this.getClass().getSimpleName()+"excute  afterbuy");
    }

    @AfterReturning("testcut(bookname)")
    public void afterreturn(String bookname) { //方法返回之后调用
//        logger.info(this.getClass().getSimpleName()+"excute  afterreturn");
    }

   /* @AfterThrowing("execution(* com.just.demo.service.UserShoppingService.buy(..))")
    public void afterthrow(){
        logger.info(this.getClass().getSimpleName()+"excute  afterthrow");
    }*/

    @Around("testcut(bookname)")
    public void around(ProceedingJoinPoint jp, String bookname) {
        logger.info("around start");
        long s1 = System.currentTimeMillis();

        logger.info("Cut inject: buy book>>" + bookname);
        try {
            Thread.currentThread().sleep(2000);
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long s2 = System.currentTimeMillis() - s1;
        logger.info("around end cosume >>" + s2 + "ms");


        logger.info(this.getClass().getSimpleName() + "around method end");
    }


}
