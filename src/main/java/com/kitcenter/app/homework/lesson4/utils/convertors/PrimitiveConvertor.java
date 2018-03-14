package com.kitcenter.app.homework.lesson4.utils.convertors;

import java.io.*;

/**
 * Created by dell on 14.03.2018.
 */
public class PrimitiveConvertor {

    int int1;
    float float1;
    String char1;

    public void floatToChar(float float1){
        String char1 = String.valueOf(float1);
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
    }

    public void intToChar(int int1) {
        char1 = String.valueOf(int1);
        System.out.println("Input float value is " + int1 + ". Output char value is " + char1);
    }

    public void charToInt(String char1){
        int1 = Integer.parseInt(char1);
        System.out.println("Input float value is " + char1 + ". Output char value is " + int1);
    }
    public void doubleToFloat(double double1){
        float1 = (float) double1;
        System.out.println("Input double value is " + double1 + ". Output float value is " + float1);
        String doubleLength = String.valueOf(double1);
        String floatLength = String.valueOf(float1);
        System.out.println("Double length is " + doubleLength.length() + " . Float length is " + floatLength.length());
    }

}
