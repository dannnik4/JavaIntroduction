package com.hillel.homework.lesson08;
import java.util.concurrent.ThreadLocalRandom;

public class Rugby {

        public static void main(String[] args) {
            new Rugby().execute();
        }

        private void execute() {
            Team Team1 = new Team("#1");
            Team Team2 = new Team("#2");
            double Team1AverageAge = Team1.averageAge();
            double Team2AverageAge = Team2.averageAge();
            System.out.println(Team1);
            System.out.println(Team1AverageAge);
            System.out.println(Team2);
            System.out.println(Team2AverageAge);
            if (Team1AverageAge > Team2AverageAge)
                System.out.println("Средний возраст игроков команды #1 больше");
            else if (Team1AverageAge < Team2AverageAge)
                System.out.println("Средний возраст игроков команды #2 больше");
            else System.out.println("Средний возраст команд равный");

        }

        class Team {
            private Person[] people;
            private String name;

            public Team(String name) {
                this.people = new Person[25];
                this.name = name;
                ThreadLocalRandom random = ThreadLocalRandom.current();
                for (int i = 0; i < 25; i++) {
                    Person person = new Person(random.nextInt(18, 30));
                    people[i] = person;
                }
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                StringBuilder builder = new StringBuilder();
                for (Person person : people) {
                    builder.append(person.getAge());
                    builder.append(" ");
                }
                return "Возраст игроков команды " + name + ": " + builder.toString();
            }

            public double averageAge() {
                double res = 0;
                for (Person person : people) res += person.getAge();
                return res / 25.0;
            }
        }

        class Person {
            private int age;

            public int getAge() {
                return age;
            }

            public Person(int age) {
                this.age = age;
            }
        }
    }