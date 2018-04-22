package com.kitcenter.app.homework.lesson10;

import java.io.*;

public class PalindromesToFile {
    private static File file = new File("inputWords.txt");
    private static File outputFile = new File("outputPalindromes.txt");
    public static void readFile(){
        FileWriter fr = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String reverseLine = new StringBuffer(line).reverse().toString();
                System.out.println(line);
                System.out.println(reverseLine);
                if (line.equals(reverseLine)){
                    fr = new FileWriter(outputFile,true);
                    System.out.println(line + " is palindrome ");
                    fr.write("\"" + line + "\" is palindrome \n");
                    fr.close();
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
