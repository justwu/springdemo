package com.just.demo.config;

import com.just.demo.inject.Buyinjecter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by flyhigh on 2017/5/21.
 */
@Configuration
@EnableAspectJAutoProxy   //创建拦截器的代理
@ComponentScan("com.just.demo")
public class Jconfig {


    @Bean
    public Buyinjecter buyinjecter() {
        return new Buyinjecter();
    }


 /*   @Bean
    @Profile("dev")
    public BaseDao getDevDao(){
        return new BaseDao("dev");
    }

    @Bean
    @Profile("prod")
    public BaseDao getProdDao(){
        return new BaseDao("prod");
    }

    @Bean
    @Conditional(Envcondition.class)   //如果env属性
    public BaseDao getConditionDao(){
        return new BaseDao("prod");
    }
*/
}
