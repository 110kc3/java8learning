package com.example.java;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayList {


    public static void main(String[] args) {


        List<String> list = new java.util.ArrayList<>();

        list.add("Warsaw");
        list.add("London");
        list.add("Edinburgh");
        list.add("New York");
        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) //iterator.hasNext returns bool that indicates if there is available data in object
        {
            String value = iterator.next();//moves to the next object and returns reference to it
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("ArrayList foreach");
        for (String value : list)
        {
            System.out.println(value);
        }
        System.out.println("");
        System.out.println("Java 8 method reference");
        list.forEach(System.out::println);


//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        String state = list.get(1);
//        System.out.println("Second element in list is: " + state);
//
//        int pos = list.indexOf("London");
//        System.out.println("London is at position " + pos);
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

