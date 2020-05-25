package com.example.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayLoop {


    public static void main(String[] args) {

//        int[] ints = {6,5,4,2};
//        Arrays.sort(ints); //sort ascending
//
//        for (int i = 0; i <ints.length ; i++) {
//            System.out.println(ints[i]);
//        }

        int[] sized = new int[10];
        for (int i = 0; i <sized.length ; i++) {
            sized[i] = i*100;
        }

        for (int i = 0; i <sized.length ; i++) {
            System.out.println(sized[i]);
        }

        int[] copied = new int[5];
        for (int i = 0; i <copied.length ; i++) {
            copied[i] = 0;
        }
        System.out.println("an ID "+ Arrays.toString(copied));
        System.arraycopy(sized,5,copied,0,5);
        System.out.println("an ID "+ Arrays.toString(copied));
        for (int value:copied )
        {
            System.out.println(value);
        }

    }


















    static String getInput(String prompt) {

        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);

        String result = null;
        try {
            result = sc.nextLine();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Unrecognised operation");
        }
        return result;
    }
    static double getNumeric(String prompt) {

        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        double result =0;
        try {
            result = sc.nextDouble();
        } catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("This is not numeral!");

        }
        return result;
    }

}

