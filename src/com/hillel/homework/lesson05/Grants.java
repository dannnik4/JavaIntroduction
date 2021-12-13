package com.hillel.homework.lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grants {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите оценку за первый предмет (от 1 до 12): ");
        double mark1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку за второй предмет (от 1 до 12): ");
        double mark2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку за третий предмет (от 1 до 12): ");
        double mark3 = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку за четвёртый предмет (от 1 до 12): ");
        double mark4 = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку за пятый предмет (от 1 до 12): ");
        double mark5 = Integer.parseInt(reader.readLine());

        double mediumMark = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;

        System.out.println("Средний бал студента равен: " + mediumMark);

        if (mediumMark >= 10) {
            System.out.println("Студент может получать повышенную стипендию");
        } else if (mediumMark >= 8 && mediumMark < 10) {
            System.out.println("Студент может получать обычную стипендию");
        } else {
            System.out.println("Студент не может получать стипендию");
        }

    }

}