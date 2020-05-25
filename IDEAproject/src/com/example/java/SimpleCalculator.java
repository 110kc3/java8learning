package com.example.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {


    public static void main(String[] args) {


        double s1 = getNumeric("Enter value 1: ");
        double s2 = getNumeric("Enter value 2: ");
        String Operation = getInput("Choose and operation (+ - * /): ");
        double result = 0;
        switch (Operation){
            case "+":
                result = addValues(s1,s2);

                break;
            case "-":
                result = subtractValues(s1,s2);
                break;
            case "*":
                result = multiplicateValues(s1,s2);
                break;
            case "/":
                result = divideValues(s1,s2);
                break;
            default:
                System.out.println("You choose wrong operation");
        }
                System.out.println("Your result is: " +result);




    }


    static double subtractValues(double s1, double s2) {
//        double value1 = Double.parseDouble(s1);
//        double value2 = Double.parseDouble(s2);

        double result = s1 - s2;


        return result;
    }
    static double divideValues(double s1, double s2) {
//        double value1 = Double.parseDouble(s1);
//        double value2 = Double.parseDouble(s2);

        double result = s1 / s2;


        return result;
    }
    static double multiplicateValues(double s1, double s2) {
//        double value1 = Double.parseDouble(s1);
//        double value2 = Double.parseDouble(s2);

        double result = s1 * s2;


        return result;
    }
    static double addValues(double s1, double s2) {
//        double value1 = Double.parseDouble(s1);
//        double value2 = Double.parseDouble(s2);

        double result = s1 + s2;


        return result;
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

