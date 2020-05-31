package com.example.java;

import utilities.MathHelper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {


    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();
        calc.calculate();


    }

    protected void calculate() {

        InputHelper helper = new InputHelper();
        double s1 = helper.getNumeric("Enter value 1: ");
        double s2 = helper.getNumeric("Enter value 2: ");
        String Operation = helper.getInput("Choose and operation (+ - * /): ");
        double result = 0;
        switch (Operation){
            case "+":
                result = MathHelper.addValues(s1,s2);

                break;
            case "-":
                result = MathHelper.subtractValues(s1,s2);
                break;
            case "*":
                result = MathHelper.multiplicateValues(s1,s2);
                break;
            case "/":
                result = MathHelper.divideValues(s1,s2);
                break;
            default:
                System.out.println("You choose wrong operation");
        }
        System.out.println("Your result is: " +result);
    }

    public class InputHelper
    {
        private String getInput(String prompt) {

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

        private double getNumeric(String prompt) {

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




}

