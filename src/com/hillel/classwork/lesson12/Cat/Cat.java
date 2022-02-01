package com.hillel.classwork.lesson12.Cat;

public class Cat {

    int weight;
    int strength;
    int age;

    public Cat(int weight, int strength, int age) {
        this.weight = weight;
        this.strength = strength;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrenght() {
        return strength;
    }

    public int getAge() {
        return age;
    }

    public void fight(Cat cat1) {
        if (this.weight > cat1.weight) {
            System.out.println(this + " wins");
        } else {
            System.out.println(cat1 + " wins");
        }
    }

}
