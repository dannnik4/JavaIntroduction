package com.hillel.homework.lesson12.Person;

class Person {

    String name;
    String surname;
    int age;
    int height;
    int weight;

    Person(){
        this.name = randomName();
        this.surname = randomSurname();
        this.age = (int)(Math.random() * 100);
        this.height = randomHeight(this.age);
        this.weight = randomWeight(this.age);
    }

    String randomName(){
        String[] value = {"Даниил", "Александр", "Артём", "Евгений", "Максим", "Алексей"};
        int i = (int)(Math.random() * value.length);
        return value[i];
    }

    String randomSurname(){
        String[] value = {"Перстнёв", "Осадчий", "Петрушевский", "Танцюра", "Серебрянский", "Чиндин"};
        int i = (int)(Math.random() * value.length);
        return value[i];
    }

    int randomHeight(int age){
        int min = 50;
        int max = 200;
        if (age < 5){
            min = 50;
            max = 68 - min;
        } else if (age >= 5 && age < 10) {
            min = 68;
            max = 125 - min;
        } else if (age >= 10 && age < 15) {
            min = 125;
            max = 160 - min;
        } else if (age >= 15 && age < 20) {
            min = 160;
            max = 180 - min;
        } else {
            min = 180;
            max = 200 - min;
        }
        int value = (int)(min + Math.random() * max);
        return value;
    }

    int randomWeight(int age){
        int min = 1;
        int max = 200;
        if (age < 2){
            min = 3;
            max = 13 - min;
        } else if (age >= 3 && age < 12) {
            min = 10;
            max = 40 - min;
        } else if (age >= 12 && age < 18) {
            min = 30;
            max = 80 - min;
        }else if (age >= 18 && age < 100) {
            min = 50;
            max = 150 - min;
        }
        int value = (int)(min + Math.random() * max);
        return value;
    }

    public String toString(){
        return surname + " " + name + ", возраст " + age + " лет/год(а), рост " + height + " см, вес " + weight + " кг;";
    }
}