package com.hillel.homework.lesson08;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Palindrome(s);
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    public static Boolean Palindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
        return s.equals(reverseString(s));

    }

}
