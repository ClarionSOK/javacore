package com.kitcenter.app.homework.lesson5;

public class Homework5 {
    public static int substraction (int s1, int s2) {return s1 - s2;}

    public static double addition (double a1, int a2) {return a1 + a2;}

    public static double division (int d1, int d2) {return d1 / d2;}

    public static double multiply (int m1, double m2) {return m1 * m2;}

    public static int s3 = substraction(66, 34);

    public static double a3 = addition(77.7, 33);

    public static double d3 = division(1000, 10);

    public static double m3 = multiply(123, 0.2);

    public static double[] results = new double[]{s3, a3, d3, m3};

    public static double sum = s3 + a3 + d3 + m3;

    public static double resultMultiplication = s3 * a3 * d3 * m3;

    public static double someFormula = (s3 + a3) * s3 - m3;

    public static int ams = (int) someFormula;


}
