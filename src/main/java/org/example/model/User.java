package org.example.model;

/***
 *
 * 用户
 */
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public User(){

    }

    public void print(){
        System.out.println(name+"  "+age);
    }
}
