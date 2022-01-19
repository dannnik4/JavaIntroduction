package com.hillel.homework.lesson11.Cat;

public class Cat {

    String name;
    int age;
    int weight;
    String breed;

    public Cat() {
        System.out.println("Cat has been created!");
    }

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public void run() {
        System.out.println("cat runs");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) objk;
            return this.name.equals(cat.name) && this.age == cat.age;
        }
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.name.equals(cat.name) && this.weight == cat.weight;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + this.name + '\'' +
                ", size='" + this.age +
                ", age=" + this.weight +
                ", color='" + this.breed + '\'' +
                '}';
    }
}