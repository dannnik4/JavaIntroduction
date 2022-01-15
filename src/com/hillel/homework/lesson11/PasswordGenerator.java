package com.hillel.homework.lesson11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordGenerator {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String UNDERSCORE = "_";

    public static void main(String[] args) {
        char[] password = new char[]{findRandomUpper(), findRandomLower(), findRandomDigits(), findUnderscore(), findRandomLower(), findRandomUpper(), findRandomDigits(), findRandomUpper()};

        int counter = 0;
        char[] newPassword = new char[password.length];
        int[] historyRandomNumbers = new int[password.lengthc];
        Arrays.fill(historyRandomNumbers, -1);

        do {
            int rand = MathUtil.getRandom(0, password.length - 1);
            if (isUnique(rand, historyRandomNumbers)) {
                newPassword[counter] = password[rand];
                historyRandomNumbers[counter] = rand;
                counter++;
            }
        } while (counter < password.length);
        System.out.println(newPassword);
    }

    public static boolean isUnique(int rand, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == rand) {
                return false;
            }
        }
        return true;
    }

    public static char findRandomUpper() {
        int randomUpper = MathUtil.getRandom(0, UPPER.length() - 1);
        char upperSymbol = UPPER.charAt(randomUpper);
        return upperSymbol;
    }

    public static char findRandomLower() {
        int randomLower = MathUtil.getRandom(0, LOWER.length() - 1);
        char lowerSymbol = LOWER.charAt(randomLower);
        return lowerSymbol;
    }

    public static char findRandomDigits() {
        int randomDigits = MathUtil.getRandom(0, DIGITS.length() - 1);
        char digits = DIGITS.charAt(randomDigits);
        return digits;
    }

    public static char findUnderscore() {
        char underscore = UNDERSCORE.charAt(0);
        return underscore;
    }

    public static class MathUtil {
        public static int getInputNumb() {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            return number;
        }

        public static int getRandom(int min, int max) {
            int r = (int) (Math.random() * (max - min + 1)) + min;
            return r;
        }

    }
}