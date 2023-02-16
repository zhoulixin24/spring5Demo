package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/***
 * 创建类，实现接口BeanPostProcessor 创建后置处理器
 */
public class MyBeanPost implements BeanPostProcessor {
    //Bean初始化方法前的后置处理器
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法执行前的后置处理器");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    //Bean初始化方法后的后置处理器
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法执行后的后置处理器");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
