package com.hillel.homework.lesson13.CoffeeMachine;

public class Drinks {

    String name;
    int price;

    Drinks(String name, int price){
        this.name = name;
        this.price = price;
    }

    void Cook (){
    }

    public String toString(){

        return "Название = " + name + ", цена " + price + " грн";
    }
}