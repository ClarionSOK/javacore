package com.kitcenter.app.classwork.lesson12;

public class Bicycle {
    public int wheelSize;
    public String color;
    public Bicycle(int wheelSize, String color){
        this(color);
        this.wheelSize = wheelSize;
    }
    public Bicycle(String color){
        this();
        this.color = color;
    }
    public Bicycle(){
        this.wheelSize = 26;
        this.color = "red";
    }
}
