package com.hillel.homework.lesson03;

public class Snowman {

    public static void main(String[] args) {

        double shar1 = 2.0;
        double shar2 = 0.5;
        double shar3 = 0.2;

        // Обьём шара = 4/3 * PI * shar^3

        double Vshar1 = (4.0 / 3.0) * java.lang.Math.PI * java.lang.Math.pow(shar1, 3);
        double Vshar2 = (4.0 / 3.0) * java.lang.Math.PI * java.lang.Math.pow(shar2, 3);
        double Vshar3 = (4.0 / 3.0) * java.lang.Math.PI * java.lang.Math.pow(shar3, 3);

        double p = 0.7;

        double Pshar1 = Vshar1 * p;
        double Pshar2 = Vshar2 * p;
        double Pshar3 = Vshar3 * p;

        double sum = Pshar1 + Pshar2 + Pshar3;

        System.out.println("Вес снеговика равен " + java.lang.Math.round(sum) + " кг");

    }

}