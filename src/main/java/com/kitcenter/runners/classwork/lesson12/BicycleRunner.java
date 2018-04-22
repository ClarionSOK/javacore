package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson12.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle standart = new Bicycle();
        System.out.println(standart.color + " and " + standart.wheelSize);
        Bicycle pro = new Bicycle(28, "Blue and yellow");
        System.out.println(pro.color + " and " + pro.wheelSize);
        Bicycle mod = new Bicycle("Black");
    }
}
