package com.baizhi.config;

import com.baizhi.interceptor.MyInterceptor1;
import com.baizhi.interceptor.MyInterceptor2;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置类
 */
@Component
//拦截器 1.x版本
//public class InterceptorConfig extends WebMvcConfigurerAdapter {
//拦截器 2.x版本
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor1())
                .addPathPatterns("/**")//拦截路径 /**表示拦截所有
                .excludePathPatterns("/user/findAll"); //排除指定请求
        registry.addInterceptor(new MyInterceptor2())
                .addPathPatterns("/**")//拦截路径 /**表示拦截所有
                .excludePathPatterns("/user/findAll"); //排除指定请求
    }
}
