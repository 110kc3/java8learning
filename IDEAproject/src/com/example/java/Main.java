package com.example.java;

import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();


        map.put("Poland", "Warsaw");
        map.put("Great Britain","London");
        map.put("Scotland", "Edinburgh");

        System.out.println(map);
        map.put("Germany", "Berlin");
        System.out.println(map);

        String cap = map.get("Scotland");
        System.out.println("The capitol of Scotland is "+cap);

        map.remove("Germany");
        System.out.println(map);
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

