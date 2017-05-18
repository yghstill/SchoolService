package com.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * 该配置类 类似于mvc配置文件:spring_mvc.xml
 * Created by SXY on 2016/1/19.
 */
// @EnableWebMvc 用来导入mvc框架的自动化配置，使用前提是该类有@Configuration存在
/*@ComponentScan 扫描控制器组件，使用方式有两种:
* 1.指定具体类 例如@ComponentScan(basePackageClasses = HelloController.class)，或者 basePackageClasses = {HelloController.class,xxx.class,…}
* 2.指定基础包 例如本例使用的方法，或者数组形式@ComponentScan({"com.*.**","com.*.**"})
* 注：basePackages 关键字 可以选择性添加，默认会自动匹配到basePackages
* */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.practice")
public class WebMvcConfig {

    //    声明页面的编码格式、类型
    private static final String CONTENTTYPE = "text/html; charset=UTF-8";

    //    Thymeleaf框架配置

    /**
     * 解析模板路径等配置
     * @return
     */
    @Bean
    public TemplateResolver templateResolver(){
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".html");
    //     去除缓存
        resolver.setCacheable(false);
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }

    /**
     * SpringTemplateEngine 继承了TemplateEngine，作为Spring使用该引擎的入口
     * @return
     */
    @Bean
    public SpringTemplateEngine templateEngine(){
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        springTemplateEngine.setTemplateResolver(templateResolver());
        return springTemplateEngine;
    }

    /**
     * 模板引擎解释器，也就是捕获controller中返回的view（字符串），进行解析
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setContentType(CONTENTTYPE);
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setOrder(1);
        return viewResolver;
    }
}
