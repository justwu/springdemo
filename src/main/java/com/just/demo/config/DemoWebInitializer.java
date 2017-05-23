package com.just.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 用这个类来代替传统的web.xml  要求服务器支持sevlet3.0 tomcat7是可以的
 * Created by flyhigh on 2017/5/23.
 */
public class DemoWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { //加载WEB应用上下文的时候初始化webconfig下 的bean
        return new Class<?>[]{Webconfig.class};//
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};  //处理所有"/"请求
    }
}
