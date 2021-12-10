package com.hillel.homework.lesson04;

public class Animals {

    public static void main(String[] args) {

        int Dogs = 24;
        int Cats = 8;
        int Portions = 50;
        int Price = 2;
        int Times = 3;
        int Days = 30;
        int Kilo = 1000;

        int DogsFood = DogsFood(Dogs, Portions, Times, Days);
        int CatsFood = CatsFood(Cats, Portions, Times, Days);
        int FullPrice = FullPrice(DogsFood, CatsFood, Price);

        System.out.println("Нужно корма для собак в месяц: " + DogsFood / Kilo + " кг");
        System.out.println("Нужно корма для котов в месяц: " + CatsFood / Kilo + " кг");
        System.out.println("Нужно денег в месяц на содержание приюта: " + FullPrice + " долларов");

    }

    public static int DogsFood(int Dogs, int Portions, int Times, int Days) {

        return Dogs * Portions * Times * Days;

    }

    public static int CatsFood(int Cats, int Portions, int Times, int Days) {

        return Cats * Portions * Times * Days;

    }

    public static int FullPrice(int DogsFood, int CatsFood, int Price) {

        return (DogsFood + CatsFood) * Price;

    }

}
