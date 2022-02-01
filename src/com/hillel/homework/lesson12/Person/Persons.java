package com.hillel.homework.lesson12.Person;

public class Persons {

    public static void main(String[] args) {
        Persons start = new Persons();
        start.buildPersonArray();
    }

    void buildPersonArray() {
        Person[] persons = new Person[100];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            System.out.println(persons[i].toString());
        }
        System.out.println(persons[23].toString());
    }
}