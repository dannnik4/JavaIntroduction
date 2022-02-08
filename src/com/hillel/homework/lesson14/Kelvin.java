package com.hillel.homework.lesson14;

class Kelvin implements Converter{

    double temperature;

    Kelvin(double temperature){
        this.temperature = temperature;
    }

    @Override
    public double convert(){
        this.temperature += 273.15;
        return this.temperature;
    }

    @Override
    public void print(){
        System.out.println(this.temperature + " градусов по Кельвину");
    }

}