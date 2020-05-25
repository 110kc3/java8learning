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



//        System.out.println("Enter numeric value:");
//        Scanner s = new Scanner(System.in);
//        String inputNumber1 = s.nextLine();
//        int x;
//        x = Integer.parseInt(inputNumber1);
//
//        System.out.println("Enter 2nd numeric value:");
//
//
//        String inputNumber2 = s.nextLine();
//        double y;
//        y = Double.parseDouble(inputNumber2);
//
//        double sum;
//        sum = x+y;
//        System.out.println("Returned: " +sum);




//         //Value adjustments - shit after adding some primitives
//        double value = .012;
//        double pSum = value + value + value;
//        System.out.println("Sum of primitives = " + pSum);//.036000000000000004
//
//        String strValue = Double.toString(value);
//        System.out.println("strValue = " + strValue);//0.012
//
//        BigDecimal bigValue = new BigDecimal(strValue);
//        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
//        System.out.println("BigDecimal sums = " + bSum.toString());//0.036
    }
}
