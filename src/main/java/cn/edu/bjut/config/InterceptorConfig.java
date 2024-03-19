package cn.edu.bjut.config;

import cn.edu.bjut.interceptor.LoginCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 配置拦截器
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry){  //添加拦截器
        registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**").excludePathPatterns("/studentLogin");
    }
}
