package com.kitcenter.app.homework.lesson11;

import java.util.Scanner;

/**
 * Created by dell on 01.05.2018.
 */
public class HumanCreator {
    public static String createHumanName(){
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя");
        name = input.nextLine();
        System.out.println(name);
        return name;
    }
    public static int createHumanAge(){
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите возраст");
        age = input.nextInt();
        if (age > 120 || age < 1) {
            System.out.println("Wrong age");
            createHumanAge();
        }
        return age;
    }
    static Human human = new Human(createHumanName(), createHumanAge());
    public static void menu(){
        Scanner input = new Scanner(System.in);
        String option;
        System.out.println("1. Show name");
        System.out.println("2. Show age");
        System.out.println("3. Change age");
        System.out.println("4. Exit");
        option = input.nextLine();
        switch (option) {
            case "1":
                System.out.println("Name is " + human.getName());
                menu();
            case "2":
                System.out.println("Age is " + human.getAge());
                menu();
            case "3":
                int age = createHumanAge();
                human.setAge(age);
                menu();
            case "4":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Please enter correct value");
                menu();
        }
    }
}
