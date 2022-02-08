package com.hillel.homework.lesson14.Sales.src.base;

public interface Income {

    double calculateIncome(int quantity, double price);
    double calculateIncome(double income, double taxFromIncome);

}