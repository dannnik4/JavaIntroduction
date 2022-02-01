package com.hillel.classwork.lesson12.Cat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatController {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //String name = CatController.READER.readLine();

        Cat cat1 = new Cat(10, 18, 4);
        Cat cat2 = new Cat(6, 13, 7);
        Cat cat3 = new Cat(11, 19, 3);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        cat1.fight(cat2);

    }
}
