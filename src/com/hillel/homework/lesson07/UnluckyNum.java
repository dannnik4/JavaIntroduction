package com.hillel.homework.lesson07;

public class UnluckyNum {

    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != 4 && j != 4)
                    if (i == 0) {
                        System.out.println("i = " + j);
                    } else {
                        System.out.println("i = " + i + j);
                    }
            }
        }

    }
}