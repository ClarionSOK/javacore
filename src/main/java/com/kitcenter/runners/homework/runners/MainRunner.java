package com.kitcenter.runners.homework.runners;


import java.io.IOException;

/**
 * Created by dell on 01.05.2018.
 */
public class MainRunner {
    public static void main(String[] args) throws IOException {
        try {
            MainRunnerHelper.mainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
