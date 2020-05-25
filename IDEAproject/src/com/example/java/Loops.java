package com.example.java;

public class Loops {

    public static void main(String[] args) {

        String[] numbers = {"1","2","3","4","5","6"};
        //for loops
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //short for loop
        for (String number : numbers)
        {
            System.out.println(number);
        }
        //while loop
        int counter=0;
        while (counter < numbers.length)
        {
            System.out.println(numbers[counter]);
            counter++;
        }
        //do while loop
        int doCounter = 0;
        do {
            System.out.println(numbers[doCounter]);
            doCounter++;
        } while (doCounter < numbers.length);

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
