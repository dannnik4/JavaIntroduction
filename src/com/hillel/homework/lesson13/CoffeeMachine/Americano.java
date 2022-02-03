package com.hillel.homework.lesson13.CoffeeMachine;

class Americano extends Drinks {

    Americano(String name, int price) {
        super(name, price);
    }

    @Override
    void Cook (){
        System.out.println("Готовим американо");
    }
}