package com.hillel.homework.lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baggage {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину длинной стороны: ");
        int dlina = Integer.parseInt(reader.readLine());
        System.out.println("Введите длину короткой стороны: ");
        int shirina = Integer.parseInt(reader.readLine());
        System.out.println("Введите длину глубины: ");
        int glubina = Integer.parseInt(reader.readLine());

        if (shirina <= 40 && (dlina + glubina) <= 75) {
            System.out.println("Багаж подходит для ручной клади");
        } else {
            System.out.println("Багаж не подходит для ручной клади");
        }

    }

}