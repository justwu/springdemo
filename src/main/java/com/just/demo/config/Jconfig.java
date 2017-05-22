package com.just.demo.config;

import com.fasterxml.jackson.databind.deser.Deserializers;
import com.just.demo.dao.BaseDao;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * Created by flyhigh on 2017/5/21.
 */
@Configuration
@ComponentScan("com.just.demo")
public class Jconfig {


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
