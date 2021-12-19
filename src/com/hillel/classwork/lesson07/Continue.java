package com.hillel.classwork.lesson07;

import java.io.IOException;

public class Continue {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 100; i++) {

            if (i % 2 != 0) {
                continue;
            }
            System.out.println("i = " + i);

        }
    }
}