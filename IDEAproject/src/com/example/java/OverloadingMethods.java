package com.example.java;

import java.util.Scanner;

public class OverloadingMethods {


    public static void main(String[] args) {

        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");
        String s4 = getInput("Enter value 4: ");
        double result = addValues(s1,s2);
        System.out.println("The result of adding 2 values is: "+ result);

        double result2 = addValues(s1,s2,s3);
        System.out.println("The result of adding 3 values is: "+ result2);
        double result3 = addValues(s1,s2,s3,s4,s1,s2,s3,s4);
        System.out.println("The result of adding 8 values is: "+ result3);



        }

    static double addValues(String s1, String s2) {
        double value1 = Double.parseDouble(s1);
        double value2 = Double.parseDouble(s2);

        double result = value1 + value2;


        return result;
    }

    static double addValues(String s1, String s2, String s3) {
        double value1 = Double.parseDouble(s1);
        double value2 = Double.parseDouble(s2);
        double value3 = Double.parseDouble(s3);

        double result = value1 + value2 + value3;


        return result;
    }
    static double addValues(String ... values) {
        double result = 0;
        for (String value : values) {
            result += Double.parseDouble(value);
        }

        return result;
    }


    static String getInput(String prompt) {

        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }


}

