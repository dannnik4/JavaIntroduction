package com.hillel.classwork.lesson07;

public class Bomb {

    public static void main(String[] args) throws InterruptedException {

        int i = 9;
        do {
            System.out.println("Time to boom: " + i + " seconds");
            i--;
            Thread.sleep(1000);
            if (i == 3) {
                break;
            }
        } while (i >= 0);

        if (i == 0) {
            System.out.println("Boom");
        } else {
            System.out.println("Bomb has been defused");
        }

    }
}