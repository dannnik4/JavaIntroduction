package com.hillel.homework.lesson13.CoffeeMachine;

class Tea extends Drinks {

    Tea(String name, int price) {
        super(name, price);
    }

    @Override
    void Cook (){
        System.out.println("Готовим чай");
    }
}