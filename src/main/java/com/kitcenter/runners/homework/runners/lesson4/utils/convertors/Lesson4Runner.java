package com.kitcenter.runners.homework.runners.lesson4.utils.convertors;

import com.kitcenter.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

/**
 * Created by dell on 14.03.2018.
 */
public class Lesson4Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convert = new PrimitiveConvertor();
        convert.floatToChar(13);
        convert.intToChar(666);
        convert.charToInt("011235813");
        convert.doubleToFloat(3.66666666666666666666666666666666666666666666666666666666666666667);
        System.out.println("");
        System.out.println("Good job!");
    }
}
