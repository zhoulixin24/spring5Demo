package org.example.model;

/**
 * 演示set方法进行诸如属性
 */
public class Book {
    private String name;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(name+"  "+author);
    }
}
