package com.just.demo.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by flyhigh on 2017/5/21.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)// 每次从应用上下文获取时创建一个BEAN实例
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)// 单例模式.应用中只初始化一次
public class PostResult {
}
