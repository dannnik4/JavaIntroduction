package com.hillel.homework.lesson11.Cat;

public class CatMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.run();

        cat.name = "Mastiff";
        cat.age = 7;
        cat.weight = 10;
        cat.breed = "Black";

        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.breed);

        Cat cat2 = new Cat();

        cat2.name = "Maltesek";
        cat2.age = 8;
        cat2.weight = 6;
        cat2.breed = "White";

        System.out.println(cat2.name);
        System.out.println(cat2.age);
        System.out.println(cat2.weight);
        System.out.println(cat2.breed);

        cat2.run();

        System.out.println(cat);
        System.out.println(cat2);

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));

    }

}