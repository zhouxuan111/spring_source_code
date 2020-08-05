package com.zx.cglib;

import com.zx.aspect.TestCglib;

/**
 * @author zhouxuan
 * @date 2020/8/5 14:17
 */
public class Test {

    public static void main(String[] args) {

        TestCglib testCglib = new CglibMethodInterceptor().getProxy(TestCglib.class);
        testCglib.test();
    }
}
