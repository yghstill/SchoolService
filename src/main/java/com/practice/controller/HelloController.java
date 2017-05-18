package com.practice.controller;

import com.practice.bean.Userbean;
import com.practice.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SXY on 2016/1/18.
 */
// 声明为controller控制器，捕获请求并处理请求
@Controller
public class HelloController {

//    注入UserDao
    @Autowired
    private UserDao userDao;

//    捕获 /hello 请求，利用hello(Model model) 处理请求，并返回‘hello’，交给Thymeleaf 处理
//    hello 对应html文件名。model 作为信息的载体，封装各类变量、对象
    @RequestMapping("/hello")
    public String hello(Model model) {

//        获取XiaoMing的相关信息
//        Userbean user = userDao.getOneUser("Sam");
//        System.out.println(user.getusername());
//        model.addAttribute("username", user.getusername());
//        model.addAttribute("idcard", user.getidcard());

        return "hello";
    }
}
