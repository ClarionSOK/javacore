package com.kitcenter.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Homework5Test {
    private static int s1;
    private static int s2;
    @Test //3 теста вычитаний
    public void substractionTest1 (){
        int s1 = 80;
        int s2 = 70;
        int actRes = Homework5.substraction(s1,s2);
        assertTrue (actRes >= 10);

    }
    // @Before
    //public void preSubstractionTest2() throws IOException {
     //   int s1 = 34;
     //   int s2 = 19;
    // }
    @Test
    public void substructionTest2() {
        int s1 = 34;
        int s2 = 19;
        int expRes = 15;
        int actRes = Homework5.substraction(s1,s2);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void substructionTest3(){
        int s1 = 19;
        int s2 = 34;
        int actRes = Homework5.substraction(s1,s2);
        assertTrue(actRes < 0);
    }

    @Test // 3 теста сложений
    public  void additionTest1(){
        double a1 = 19.1;
        int a2 = 11;
        double actRes = Homework5.addition(a1,a2);
        assertTrue(actRes > 30);
        assertTrue(actRes < 30.2);
    }
    @Test
    public  void additionTest2(){
        double a1 = 177.34;
        int a2 = 177;
        double expRes = a1 + a2;
        double actRes = Homework5.addition(a1,a2);
        Assert.assertEquals(expRes, actRes, 0);
    }
    @Test
    public  void additionTest3(){
        double a1 = 66.6;
        int a2 = 0;
        double actRes = Homework5.addition(a1,a2);
        Assert.assertEquals(actRes, a1, 0);

    }

    @Test // 3 теста деления
    public void divisionTest1(){
        int d1 = 3;
        int d2 = 10;
        double actRes = Homework5.division(d1,d2);
        assertTrue(actRes <= 0.3);
    }
    @Test
    public void divisionTest2(){
        int d1 = 10;
        int d2 = 3;
        int actRes = (int) Homework5.division(d1,d2);
        assertFalse(actRes > 3);

    }
    @Test
    public void divisionTest3(){
        int d1 = 100;
        int d2 = 10;
        int d3 = 1100;
        int d4 = 110;
        int actRes = (int) Homework5.division(d1,d2);
        int actRes2 = (int) Homework5.division(d3,d4);
        Assert.assertEquals(actRes, actRes2);

    }
    @Test // 3 теста умноения
    public  void multiplyTest1(){
        int m1 = 11;
        int expRes = 121;
        int actRes = (int) Homework5.multiply(m1,m1);
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public  void multiplyTest2(){
        int m1 = 100;
        double m2 = 0.2;
        double expRes = 20;
        double actRes = Homework5.multiply(m1, m2);
        Assert.assertEquals(actRes, expRes, 0);

    }
    @Test
    public  void multiplyTest3(){
        int expRes = 100;
        int m1 = expRes/2;
        double actRes = Homework5.multiply(m1, 2);
        assertTrue(actRes > 0);
        Assert.assertEquals(expRes, actRes, 0);
    }
    @Test
    public void resultsArrayTest(){
        Assert.assertNotNull(Homework5.results);
        String expRes = "[32.0, 110.7, 100.0, 24.6]";
        String actRes = Arrays.toString(Homework5.results);
        Assert.assertEquals(actRes, expRes);
    }
    @Test
    public void sumTest(){
        Assert.assertTrue(Homework5.sum > 0);
        Assert.assertTrue(Homework5.sum >= (32.0 + 110.7 + 100 + 24.6));
    }
    @Test
    public void resultMultiplicationTest(){
        double expRes = 8714304.0;
        double actRes = Homework5.resultMultiplication;
        Assert.assertEquals(actRes,expRes, 0);
    }
    @Test
    public void formulaTest(){
        Assert.assertTrue(Homework5.someFormula > 4541);
        Assert.assertTrue(Homework5.ams < Homework5.someFormula);
    }
}
