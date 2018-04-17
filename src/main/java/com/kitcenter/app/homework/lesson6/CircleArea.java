package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by dell on 17.04.2018.
 */
public class CircleArea {
    public static final double pi = 3.14d;
        public static double calculate(){
            System.out.println("Please enter first circle radius");
            Scanner scanner = new Scanner(System.in);
            double radius = scanner.nextDouble();
            double circleArea = pi * radius * radius;
            System.out.println("Area is " + circleArea);
            return circleArea;
        }
    public static double calculate2(){
        System.out.println("Please enter second circle radius");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double circleArea = pi * radius * radius;
        System.out.println("Area is " + circleArea);
        return circleArea;
    }
    public static void calculateBigger(){
        if (calculate() > calculate2())
            System.out.println("Circle1 is bigger");
        else
            System.out.println("Circle2 is bigger");

    }
    public static void triangleHypotenuse(){
        System.out.println("Please enter first side of triangle");
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        System.out.println("Please enter second side of triangle");
        double side2 = scanner.nextDouble();
        double hyp = Math.sqrt((side1 * side1)+ (side2 * side2));
        System.out.println("Hypotenuse is " + hyp);
    }
    public static void biggerNumber(){
        System.out.println("Please enter first number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println("First number is bigger");
        }
        else {
            System.out.println("Second number is bigger");
        }
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a program to run");
        System.out.println("1. Circle area calculator");
        System.out.println("2. Bigger circle area");
        System.out.println("3. Calculating hypotenuse of right-angled triangle");
        System.out.println("4. Bigger number");
        System.out.println("Note: you can always quit with \"exit\" command");
        String option = scanner.nextLine();
        switch (option){
            case "1": calculate();
            case "2": calculateBigger();
            case "3": triangleHypotenuse();
            case "4": biggerNumber();
            case "exit": break;
            default:
                System.out.println("Wrong option. Please try again or quit");
                menu();
        }
    }
}
