package com.zx.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 追踪源码
 * @author zhouxuan
 * @date 2020/5/22 16:50
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

       /* TestCglib userService = (TestCglib) context.getBean("testCglib");
        userService.test();

        UserService userService = (UserService) context.getBean("userService");

        userService.add();*/

    }
}
