package org.example.factorybean;

import org.example.model.Book;
import org.springframework.beans.factory.FactoryBean;

//public class Mybean implements FactoryBean<Book> {
public class Mybean{
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步:调用set方法设置属性值");
    }

    public Mybean(String name) {
        this.name = name;
    }

    public Mybean() {
        System.out.println("第一步:构建无参构造函数创建bean示例");
    }

/*    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setName("阿甩甩");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }*/

    public void initMethod(){
        System.out.println("第三步：执行初始化方法");
    }

    public void way(){
        System.out.println("第四步：拿到对象使用对象中的方法");
    }
    public void destoryMethod(){
        System.out.println("第五步:销毁的时候执行方法");
    }
}
