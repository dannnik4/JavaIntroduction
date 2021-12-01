package com.hillel.classwork.lesson02;

public class Variables {

    public static void main(String[] args) {

        System.out.println("Variables:");

        byte myByte = 101;
        System.out.println("this is byte: " + myByte + "!");

        short myShort = 30000;
        System.out.println("this is short: " + myShort);

        int result = myByte * myShort;
        System.out.println("this is result: " + result);

        int myInt = 345_457_567;
        System.out.println(myInt);

        long myLong = 100_000_000_000L;
        System.out.println(myLong);

        float myFloat = 45.890F;
        System.out.println(myFloat);

        double myDouble = 568678678.456456456456;
        System.out.println(myDouble);

        boolean isValid = true;
        System.out.println(isValid);

        char myChar = '&';
        System.out.println(myChar);

        char myNumericChar = 56756;
        System.out.println(myNumericChar);

        char ch3 = '\u0054';
        System.out.println(ch3);

        String string = "test";
        System.out.println("this is string: " + string);

    }

}