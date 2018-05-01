package com.kitcenter.app.homework.lesson9;

import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Palindromes {
    public static String filePath = System.getenv("write.path");
    public static void menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку для проверки");
        String value = input.nextLine();
        value = value.toLowerCase();
        if (!value.equals("")){
        System.out.println("Введите метод сканирования (1-3) или завершите программу (любой другой символ)");
        String method = input.nextLine();
        switch (method) {
            case "1":
                try {
                    firstMethod(value);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
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

    public static void firstMethod(String value) throws IOException {
        String revValue = new StringBuffer(value).reverse().toString();
        if (value.equals(revValue)) {
            System.out.println("Введенная строка - палиндром");
            BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));
            write.append(value);
            write.close();
        }
        else {
            System.out.println("Введенная строка не является палиндромом");
        }
        startOver();
    }
    public static void secondMethod(String value) throws IOException {
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
    public static void thirdMethod(String value) throws IOException {
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
    public static void startOver () throws IOException {
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
