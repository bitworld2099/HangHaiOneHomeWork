package com.jk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Zvoy
 * @Date 2019/12/26 17:16
 * @Version 1.0
 */
@Configuration
public class CurdConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("crud");
        registry.addViewController("/main").setViewName("crud");
    }

}
