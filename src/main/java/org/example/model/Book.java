package org.example.model;

/**
 * 演示set方法进行诸如属性
 */
public class Book {
    private String name;
    private String author;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }


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
