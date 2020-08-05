package com.zx.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author zhouxuan
 * @date 2020/8/5 14:10
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    public CglibMethodInterceptor() {

    }

    public <T> T getProxy(Class c) {

        //字节增强器
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(c);
        //设置回调
        enhancer.setCallback(this);
        //1:生成源代码 2：编译成class文件 3:加载到JVM,并返回被代理对象
        return (T) enhancer.create();
    }

    /**
     * 拦截所有目标方法的调用
     * @param o ： 目标对象
     * @param method ：目标的方法
     * @param objects ： 参数
     * @param methodProxy ： 代理类实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理");

        return methodProxy.invokeSuper(o, objects);
    }
}
