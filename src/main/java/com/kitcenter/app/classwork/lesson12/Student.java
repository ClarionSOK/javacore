package com.kitcenter.app.classwork.lesson12;

public class Student extends Person{
    private int age;

    public Student(String name, int age){
        super(name);
        this.age = age;
    }
    public String getResponse(){
        return name;
    }

}
