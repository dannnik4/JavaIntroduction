package com.hillel.homework.lesson13.CoffeeMachine;

class Cappuchino extends Drinks {

    Cappuchino(String name, int price) {
        super(name, price);
    }

    @Override
    void Cook (){
        System.out.println("Готовим капучино");
    }
}