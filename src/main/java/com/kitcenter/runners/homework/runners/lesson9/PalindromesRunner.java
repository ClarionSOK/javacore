package com.kitcenter.runners.homework.runners.lesson9;

import com.kitcenter.app.homework.lesson9.Palindromes;

import java.io.FileNotFoundException;
import java.io.IOException;


public class PalindromesRunner {
    public static void main(String[] args) throws IOException {
        try {
            Palindromes.menu();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
