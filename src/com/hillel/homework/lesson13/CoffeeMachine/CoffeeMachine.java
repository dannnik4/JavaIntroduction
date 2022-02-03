package com.hillel.homework.lesson13.CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class CoffeeMachine {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Выберите напиток:");
        System.out.println("1: Американо");
        System.out.println("2: Латте");
        System.out.println("3: Капучино");
        System.out.println("4: Чай");
        System.out.println("5: Закончить выбор");
        List<Drinks> order = new ArrayList<>();
        Drinks toOrder = mainMenu();
        while (toOrder != null){
            order.add(toOrder);
            toOrder = mainMenu();
        }

        OrderCheck checkToUser = new OrderCheck(order);
    }

    static Drinks mainMenu() throws IOException {
        Drinks drink = null;
        switch(READER.readLine()){
            case "1":
                drink = new Americano("Американо", 10);
                break;
            case "2":
                drink = new Latte("Латте", 5);
                break;
            case "3":
                drink = new Cappuchino("Капучино", 15);
                break;
            case "4":
                drink = new Tea("Чай", 10);
                break;
            case "5":
                drink = null;
                break;
            default:
                System.out.println("Неправильный номер напитка");
                drink = mainMenu();
        }
        return drink;
    }
}