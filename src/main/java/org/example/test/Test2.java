package org.example.test;

import org.example.model.Book;
import org.example.model.User;
import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试外部bean依赖注入
 */
public class Test2 {
    @Test
    public void testAdd() {
        //加载配置文件
       ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
       //获取对象
        UserService userService= context.getBean("userService",UserService.class);
        //调用对象方法
        userService.print();
    }
}
