package com.example.java;

import java.util.*;

public class HashMap {


    public static void main(String[] args) {


        Map<String, String> map = new java.util.HashMap<>();


        map.put("Poland", "Warsaw");
        map.put("Great Britain","London");
        map.put("Scotland", "Edinburgh");

        //System.out.println(map);
        map.put("Germany", "Berlin");
        System.out.println(map);

        System.out.println("HashMap iterator");
        Set<String> keys = map.keySet();
        Iterator<String > iterator = keys.iterator();
        while (iterator.hasNext())
        {
            String key = iterator.next();
            System.out.println("The capitol of "+key+" is "+map.get(key));
        }
        System.out.println("HashMap foreach");
        for (String key:keys) {
            System.out.println("The capitol of "+key+" is "+map.get(key));
        }
//        String cap = map.get("Scotland");
//        System.out.println("The capitol of Scotland is "+cap);
//
//        map.remove("Germany");
//        System.out.println(map);


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

