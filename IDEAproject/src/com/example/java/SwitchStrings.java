package com.example.java;

import java.util.Scanner;

public class SwitchStrings {

    public static void main(String[] args) {



        System.out.println("Enter numeric value:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();



        switch (input){
            case "Jan":
                System.out.println("The month is January");
                break;
            case "Feb":
                System.out.println("The month is February");
                break;
            case "Mar":
                System.out.println("The month is March");
                break;
            default:
                System.out.println("You choose another month");
        }


    }
}
