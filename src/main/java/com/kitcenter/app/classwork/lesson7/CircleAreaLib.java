package com.kitcenter.app.classwork.lesson7;

import java.util.Scanner;

public class CircleAreaLib {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        String enteredRadius = scanner.nextLine();
        double radius = Integer.parseInt(enteredRadius);
        double circleArea = Math.PI * (radius * radius);
        System.out.println("Area is " + circleArea);
    }
}
