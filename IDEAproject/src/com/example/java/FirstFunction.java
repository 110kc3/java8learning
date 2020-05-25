package com.example.java;

public class FirstFunction {

    static String[] numbers = {"1","2","3","4","5","6"};

    public static void main(String[] args) {
        loopIt("Numbers: ");
        }

    static void loopIt(String label) {
        System.out.println(label);
        for (int i = 0; i < label.length()-1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
