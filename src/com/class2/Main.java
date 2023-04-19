package com.class2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileManagement file = new FileManagement();
        int choose;

        do {
            System.out.println("1. Count Word In File ");
            System.out.println("2. Find File By Word ");
            System.out.println("3. Exit");
            System.out.println("Choose menu: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    System.out.println("Enter file Source ");
                    String Source = sc.nextLine();
                    File fileSource = new File(Source);
                    System.out.print("Enter word to find: ");
                    String word = sc.nextLine();
                    try {
                        int count = file.countWord(fileSource, word);
                        if(count > 0) {
                            System.out.println(word + " found " + count + " times");
                        } else  {
                            System.out.println("Word not found");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
                case 2: {
                    System.out.println("Enter file Source ");
                    String Source = sc.nextLine();
                    System.out.print("Enter word to find: ");
                    String word = sc.nextLine();
                    File directory
                            = new File(Source);

                    try {
                        file.getFile(directory, word);
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
                case 3: {
                    System.out.println("Close application");
                    return;
                }
            }
        } while(true);
    }
}
