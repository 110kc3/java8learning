package com.example.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String[][] countries = new String[3][2];
        countries[0][0] = "Poland";
        countries[0][1] = "Warsaw";
        countries[1][0] = "Great Britain";
        countries[1][1] = "London";
        countries[2][0] = "Scotland";
        countries[2][1] = "Edinburgh";

        for (int i = 0; i <countries.length ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capitol of: ")
                    .append(countries[i][0])
                    .append(" is ")
                    .append(countries[i][1]);
            System.out.println(sb);
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

