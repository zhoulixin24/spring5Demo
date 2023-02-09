package org.example;


import org.example.model.Book;
import org.example.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd() {
        //1.加载xml文件
        // BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建对象
        User user = context.getBean("user", User.class);
        Book book1 = context.getBean("book",Book.class);
        book1.print();
        user.print();
    }
}
