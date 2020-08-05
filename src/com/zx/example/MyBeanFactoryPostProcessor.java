package com.zx.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 自定义工厂的后置处理器 (增强器)- 对Bean的BeanDefinition对象进行处理
 * @author zhouxuan
 * @date 2020/5/28 11:25
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition definition = beanFactory.getBeanDefinition("myBeanFactoryPostProcessor");
        System.out.println(definition.getBeanClassName());
        System.out.println("自定义工厂的增强器");
    }
}
