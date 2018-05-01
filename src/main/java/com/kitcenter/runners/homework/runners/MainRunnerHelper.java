package com.kitcenter.runners.homework.runners;

import com.kitcenter.app.homework.lesson10.ConsoleToFile;
import com.kitcenter.app.homework.lesson10.NumbersToArray;
import com.kitcenter.app.homework.lesson10.PalindromesToFile;
import com.kitcenter.app.homework.lesson11.HumanCreator;
import com.kitcenter.app.homework.lesson4.utils.convertors.PrimitiveConvertor;
import com.kitcenter.app.homework.lesson5.Homework5;
import com.kitcenter.app.homework.lesson6.CircleArea;
import com.kitcenter.app.homework.lesson8.ArrayPlayground;
import com.kitcenter.app.homework.lesson9.Palindromes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dell on 01.05.2018.
 */
public class MainRunnerHelper {
    public static void mainMenu() throws IOException {
        System.out.println("1. Lesson 4. Primitive convertor");
        System.out.println("2. Lesson 5. Math");
        System.out.println("3. Lesson 6. Circle area");
        System.out.println("4. lesson 8. Array playground");
        System.out.println("5. lesson 9. Palindromes");
        System.out.println("6. lesson 10. Working with files");
        System.out.println("7. lesson 11. Human creator");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1: convertorOptions();
            case 2: mathOptions();
            case 3: CircleArea.menu();
            case 4: arrayOptions();
            case 5: Palindromes.menu();
            case 6: fileOptions();
            case 7: HumanCreator.menu();

            case 0: break;
            default:
                System.out.println("Wrong option");
                mainMenu();
        }
    }
    public static void convertorOptions() throws IOException {
        System.out.println("1. Float to char");
        System.out.println("2. int to char");
        System.out.println("3. char to int");
        System.out.println("4. double to float");
        System.out.println("5. Main menu");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        PrimitiveConvertor convert = new PrimitiveConvertor();
        switch (option){
            case 1: convert.floatToChar(13);
            mainMenu();
            case 2: convert.intToChar(666);
            mainMenu();
            case 3: convert.charToInt("011235813");
            mainMenu();
            case 4: convert.doubleToFloat(3.66666666666666666666666666666666666666666666666666666666666666667);
            mainMenu();
            case 5: mainMenu();
        }
    }
    public static void mathOptions()throws IOException{
        System.out.println("1. Результат вычислений основных операций");
        System.out.println("2. Сумма всех результатов вычислений");
        System.out.println("3. Результат умножения всех результатов вычислений");
        System.out.println("4. Результат основной формулы");
        System.out.println("5. Main menu");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1: System.out.println("Результат вычислений основных операций: " + Arrays.toString(Homework5.results));
            case 2: System.out.println("Сумма всех результатов вычислений: " + Homework5.sum);
            case 3: System.out.println("Результат умножения всех результатов вычислений: " + Homework5.resultMultiplication);
            case 4: System.out.println("Результат основной формулы: " + Homework5.ams);
            case 5: mainMenu();
        }
    }
    public static void arrayOptions()throws IOException{
        System.out.println("1. Even numbers");
        System.out.println("2. Odd numbers");
        System.out.println("3. Odd numbers reverse");
        System.out.println("4. Range 0 to 9");
        System.out.println("5. Min and max number");
        System.out.println("6. Main menu");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1: ArrayPlayground.evenNumbers();
            case 2: ArrayPlayground.oddNumbers();
            case 3: ArrayPlayground.oddNumbersReverse();
            case 4: ArrayPlayground.range0to9();
            case 5: ArrayPlayground.minMax();
            case 6: mainMenu();
        }
    }
    public static void fileOptions() throws IOException {
        System.out.println("1. Console to file");
        System.out.println("2. Numbers to array");
        System.out.println("3. Palindromes to file");
        System.out.println("4. Main menu");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1: ConsoleToFile.writeToFile();
            case 2: NumbersToArray.readFile();
            case 3: PalindromesToFile.readFile();
            case 4: mainMenu();
        }
    }
}
