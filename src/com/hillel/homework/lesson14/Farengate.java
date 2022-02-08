package com.hillel.homework.lesson14;

public class Farengate implements Converter{

    double temperature;

    Farengate(double temperature){
        this.temperature = temperature;
    }

    @Override
    public double convert(){
        this.temperature = this.temperature * 1.8 + 32;
        return this.temperature;
    }

    @Override
    public void print(){
        System.out.println(this.temperature + " градусов по Фаренгейту");
    }

}