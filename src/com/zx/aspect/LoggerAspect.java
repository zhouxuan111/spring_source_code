package com.zx.aspect;

/**
 * @author zhouxuan
 * @date 2020/8/4 14:02
 */

public class LoggerAspect {

    public void before() {
        System.out.println("before ...");
    }

    public void after() {
        System.out.println("after ...");
    }

}
