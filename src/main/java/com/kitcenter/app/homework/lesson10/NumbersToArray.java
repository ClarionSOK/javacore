package com.kitcenter.app.homework.lesson10;

import java.io.*;
import java.util.Arrays;

public class NumbersToArray {
    private static File file = new File("inputInt.txt");
    public static void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            String numbers[] = line.split(",");
            reader.close();
            int numberArray[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++){
                numberArray[i] = Integer.parseInt(numbers[i]);
            }
            Arrays.sort(numberArray);
            System.out.println(Arrays.toString(numberArray));
            BufferedWriter write = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("outputInt.txt")));
            write.append(Arrays.toString(numberArray));
            write.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
