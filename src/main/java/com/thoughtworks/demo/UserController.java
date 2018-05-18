package com.thoughtworks.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    //使用RequestMapping指定可以访问的URL路径
    @RequestMapping("/User")
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        User user_1 = new User();
        user_1.setAge(1);
        user_1.setName("jack");
        user_1.setSex("Female");
        user_1.setId(1);
        users.add(user_1);

        User user_2 = new User();
        user_2.setAge(4);
        user_2.setName("Tom");
        user_2.setSex("male");
        user_2.setId(2);
        users.add(user_2);
        return users;
    }
}

//SpringMVC lets you create special @controller
//Spring MVC Auto-configration   HttpMessageConverter interface to convert HTTP request and response
//static  content

//servlet 中的展现   检查URL有没有对应的controller 如果有，则调用controller
//controller 开始执行业务逻辑，

