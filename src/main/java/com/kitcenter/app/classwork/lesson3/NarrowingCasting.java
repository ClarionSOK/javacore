package com.kitcenter.app.classwork.lesson3;

/**
 * Created by dell on 13.03.2018.
 */
public class NarrowingCasting {
    int int1 = 127;
    float float1 = 0.0f;

    int intPi = 0;
    float floatPi = 3.14159f;


    public void narrowing() {
        float1 = int1;
        System.out.println(float1);
    }

    public void narrowingPi() {
        intPi = (int) floatPi;
        System.out.println(floatPi);
    }


}