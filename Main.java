package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int maximumSize = 10;
        String[] words = new String[maximumSize];
        int n = readWords("bright.txt", words, maximumSize);
        print(words, n);
    }
    public static int findLongest(String[] list, int n) {
        int longest = 0;
        for(int i = 0; i < n; i++) {
            if(list[i].length() > longest) {
                longest = list[i].length();

            }
        }
        return longest;
    }
    public static void selectionSort(String[] list, int n){

    }


    public static void print(String[] list, int n){
        System.out.printf("----- Printing %d entries -------\n", n);
        for(int i=0; i<n; i++)
            System.out.printf("[%2d] %s\n", i, list[i]);
    }

    public static int readWords(String fileName, String[] list, int maximumSize){
        int n = 0;
        try {
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNext() && n < maximumSize){
                String word = input.next();
                list[n] = word;
                n++;
            }

            input.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return n;
    }
}
