package com.kitcenter.runners.homework.runners.lesson5;

import com.kitcenter.app.homework.lesson5.Homework5;

import java.util.Arrays;

public class lesson5Runner {
    public static void main(String[] args) {

        System.out.println("Результат вычислений основных операций: " + Arrays.toString(Homework5.results));

        System.out.println("Сумма всех результатов вычислений: " + Homework5.sum);

        System.out.println("Результат умножения всех результатов вычислений: " + Homework5.resultMultiplication);

        System.out.println("Результат основной формулы: " + Homework5.ams);
    }
}
