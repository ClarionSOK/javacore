package com.kitcenter.app.classwork.lesson5;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by dell on 15.03.2018.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathFuncTest {
    @Test // Junit test
    public void multiplyTest (){
        int a = 3;
        int b = 8;
        int expRes = 24;
        int actRes = MathFunc.multiply(a,b);
        Assert.assertEquals(expRes, actRes);
    }
    @Ignore("Test ignore")
    @Test(timeout = 1000) // Junit test
    public void multiplyTest2 (){
        int a = 5;
        int b = 8;
        int expRes = 40;
        int actRes = MathFunc.multiply(a,b);
        Assert.assertEquals(expRes, actRes);
    }
}
