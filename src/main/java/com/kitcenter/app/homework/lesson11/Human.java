package com.kitcenter.app.homework.lesson11;

/**
 * Created by dell on 01.05.2018.
 */
public class Human {
    private String name;
    private int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
