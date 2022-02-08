package com.hillel.homework.lesson14.Sales.src.controllers;

import com.hillel.homework.lesson14.Sales.src.models.Product;
import com.hillel.homework.lesson14.Sales.src.utils.Rounder;
import com.hillel.homework.lesson14.Sales.src.views.SalesView;

public class ProductController {

    Product model;
    SalesView view;


    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        String name = model.getName();
        double income = Rounder.rounder(model.calculateIncome(model.getQuantity(), model.getPrice()));
        double taxFromIncome = Rounder.rounder(model.taxFromIncome(income));
        double pureIncome = Rounder.rounder(model.calculateIncome(income, taxFromIncome));

        String output =  "\tНаименование товара: " + name
                + "\nОбщий доход (грн.): " + income
                + "\nСумма налога (грн.): " + taxFromIncome
                + "\nЧистый доход (грн.): " + pureIncome;

        view.getOutput(output);
    }
}