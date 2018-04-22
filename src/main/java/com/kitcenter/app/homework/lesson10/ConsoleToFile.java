package com.kitcenter.app.homework.lesson10;

import java.util.Scanner;
import java.io.*;

public class ConsoleToFile {
    static String nameTheFile() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name :");
        String fileName = input.nextLine();
        System.out.println("Enter the text (\"exit\" to abort)");
        return fileName;
    }
    private static File outputFile = new File(nameTheFile());
    private static FileWriter fr = null;
    public static void writeToFile() throws IOException {
        Scanner input = new Scanner(System.in);
        fr = new FileWriter(outputFile,true);
        String text = input.nextLine();
        switch (text){
            case "exit":
                break;
            default:
                fr.write(text + "\n");
                fr.close();
                writeToFile();
        }
    }
}
