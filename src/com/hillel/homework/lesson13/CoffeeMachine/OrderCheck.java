package com.hillel.homework.lesson13.CoffeeMachine;

import java.util.List;
public class OrderCheck {

    final private List<Drinks> order;
    final private int sum;

    OrderCheck(List<Drinks> order) {
        this.order = order;
        this.sum = sumOfOrder(order);
        toPrint(this.order, this.sum);
        toCook(this.order);
    }

    private int sumOfOrder(List<Drinks> order) {
        int sum = 0;
        for (int i = 0; i < order.size(); i++) {
            sum = sum + order.get(i).price;
        }
        return sum;

    }

    private void toPrint(List<Drinks> order, int sum){
        int counter = 0;
        for (Drinks x: order) {
            counter++;
            System.out.println(counter + ". " + x);
        }
        System.out.println("Сумма: " + sum + " грн");
    }

    private void toCook(List<Drinks> order) {
        int sum = 0;
        for (int i = 0; i < order.size(); i++) {
            order.get(i).Cook();
        }
    }

}
