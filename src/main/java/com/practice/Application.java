package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;

/**
 * Created by ygh on 2016/1/18.
 */
/* @SpringBootApplication 包含了：
 * 1、@Configuration  该类是一个配置文件
 * 2、@EnableAutoConfiguration 告诉spring-boot 进行自动化配置，加载基础包
 * 3、@ComponentScan 自动扫描当前包下的class，完成mvc配置
 * exclude 关键字，用来排除不需要的配置。比如我们要自定义 模板引擎，原有的就可以排除掉
 * */
@SpringBootApplication(exclude = {ThymeleafAutoConfiguration.class})
public class Application {
//    main方法作为程序入口，启动spring程序
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
