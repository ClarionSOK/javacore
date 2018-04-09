package com.kitcenter.app.homework.lesson9;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Palindromes {
    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку для проверки");
        String value = input.nextLine();
        value = value.toLowerCase();
        if (!value.equals("")){
        System.out.println("Введите метод сканирования (1-3) или завершите программу (любой другой символ)");
        String method = input.nextLine();
        switch (method) {
            case "1":
                firstMethod(value);
            case "2":
                secondMethod(value);
            case "3":
                thirdMethod(value);
            default:
                System.out.println("Завершение работы");
                break;
        }}
        else {
            menu();
        }
    }

    public static void firstMethod(String value){
        String revValue = new StringBuffer(value).reverse().toString();
        if (value.equals(revValue)) {
            System.out.println("Введенная строка - палиндром");
        }
        else {
            System.out.println("Введенная строка не является палиндромом");
        }
        startOver();
    }
    public static void secondMethod(String value){
        char[] valueArray= value.toCharArray();
        char[] revArray = new char[valueArray.length];
        int j = 0;
        for (int i = valueArray.length-1; i>=0; i--){
            revArray[j]= valueArray[i];
            j++;

        }
        if (Arrays.equals(valueArray, revArray)) {
            System.out.println("Введенная строка - палиндром");
        }
        else {
            System.out.println("Введенная строка не является палиндромом");
        }
        startOver();
    }
    public static void thirdMethod(String value){
        char[] valueArray= value.toCharArray();
        char[] revArray = value.toCharArray();
        int first = 0;
        int last = valueArray.length - 1;
        for(first = 0; first < last; first++, last --){
            char temp = revArray[first];
            revArray[first] = revArray[last];
            revArray[last] = temp;
        }
        if (Arrays.equals(valueArray, revArray)) {
            System.out.println("Введенная строка - палиндром");
        }
        else {
            System.out.println("Введенная строка не является палиндромом");
        }
        startOver();
    }
    public static void startOver (){
        System.out.println("Введите q для выхода или любой символ что бы начать сначала");
        Scanner qinput = new Scanner(System.in);
        String quit = qinput.nextLine();
        switch (quit){
            case "q":
                break;
            default:
                menu();
        }
    }

}
