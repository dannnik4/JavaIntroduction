package com.hillel.homework.lesson13.CoffeeMachine;

class Latte extends Drinks {

    Latte(String name, int price) {
        super(name, price);
    }

    @Override
    void Cook (){
        System.out.println("Готовим латте");
    }
}