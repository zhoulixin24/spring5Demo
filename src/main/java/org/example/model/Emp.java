package org.example.model;

/**
 * 员工
 */
public class Emp {
    private String name;
    private String sex;
    //员工属于某个部分
    private Dept dept;
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void test(){
        System.out.println(name + sex+dept.toString());
    }
}
