package com.kitcenter.app.homework.lesson8;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPlayground {
    public static void evenNumbers(){
        int[] evenArray = {2,4,6,8,10,12,14,16,18,20};
        int arrayIndex = 0;
        while (arrayIndex < evenArray.length){
            System.out.print(evenArray[arrayIndex] + " ");
            arrayIndex++;
        }
        System.out.println();
        arrayIndex=0;
        while (arrayIndex < evenArray.length){
            System.out.println(evenArray[arrayIndex]);
            arrayIndex++;
        }
    }

    public static void oddNumbers(){
        int[] oddArray = new int[50];
        int x = 1;
        for (int i = 0; i < oddArray.length; i++){
            oddArray[i] = x;
            x +=2;
        }
        for (int i=0; i < oddArray.length; i++){
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
    }

    public static void oddNumbersReverse(){
        int[] oddArray = new int[50];
        int x = 1;
        for (int i = 0; i < oddArray.length; i++){
            oddArray[i] = x;
            x +=2;
        }
        for (int i=oddArray.length; i > 0; i--){
            System.out.print(oddArray[i-1] + " ");
        }
        System.out.println();
    }
    public static void range0to9 (){
        int[] randomArray = new int[15];
        int a = 0;
        int b = 0;
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = (int) (Math.random() * 10);
            System.out.print(randomArray[i] + " ");
            if (randomArray[i]%2 == 0 ){
                a++;
            } else {
                b++;
            }
        }
        System.out.println();
        System.out.println("В массиве " + a + " четных чисел");
        System.out.println("В массиве " + b + " нечетных чисел");
    }
    public  static void minMax(){
        int[] randomArray = new int[15];
        int a = 0;
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = (int) (Math.random() * 1000);
            System.out.print(randomArray[i] + " ");
        }
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[a]<randomArray[i]) a=i;
        }
        System.out.println();
        System.out.println("Максимальное число массива: " + randomArray[a]);
        int b = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[b]>randomArray[i]) b=i;
        }
        System.out.println("Минимальное число массива: " + randomArray[b]);
    }

}
