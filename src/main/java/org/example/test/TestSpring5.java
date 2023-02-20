package org.example.test;


import org.example.autowiter.Emp;
import org.example.factorybean.Mybean;
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

    @Test
    public void testFactoryBean() {
        //1.加载xml文件
        // BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");
        //2.获取配置创建对象
       // Book book = context.getBean("mybean", Book.class);//这里要返回的是Book类 所以不能用Mybean.class
        Mybean mybean = context.getBean("mybean",Mybean.class);
        mybean.way();
        //需要手动调用方法销毁bean
        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test
    public void testAutowire() {
        //1.加载xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        //2.获取配置创建对象
        Emp emp = context.getBean("emp",Emp.class);
        emp.test();
    }
}
