package com.zx.jdk;

import com.zx.aspect.UserService;
import com.zx.aspect.UserServiceImpl;

/**
 * @author zhouxuan
 * @date 2020/8/5 10:57
 */
public class Test {

    public static void main(String[] args) {
        //生成代理对象
        UserService userService = new JdkDynamicProxy(new UserServiceImpl()).getProxy();

        userService.add();
    }
}
