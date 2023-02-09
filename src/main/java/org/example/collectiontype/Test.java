package org.example.collectiontype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }
}
