package com.hillel.homework.lesson07;

import java.util.Scanner;
import java.lang.Math;

public class GuessNum {

    public static void main(String[] args) {

        int Number, MyNumber;
        Scanner input = new Scanner(System.in);
        Number = (int) Math.floor(Math.random() * 10);
        do {
            System.out.print("Введите число: ");
            MyNumber = input.nextInt();
            if (MyNumber == Number) {
                System.out.println("Вы угадали!");
            } else if (MyNumber < 0 || MyNumber > 10) {
                System.out.println("Число не из диапазона от 0 до 10");
            } else {
                System.out.println("Вы не угадали!");
            }
        } while (MyNumber != Number);
    }
}