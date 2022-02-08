package com.hillel.homework.lesson14.Sales.src;

import com.hillel.homework.lesson14.Sales.src.controllers.ProductController;
import com.hillel.homework.lesson14.Sales.src.models.Product;
import com.hillel.homework.lesson14.Sales.src.views.SalesView;

public class App {

    public static void main(String[] args) {

        Product model = new Product();
        SalesView view = new SalesView(model);

        ProductController controller = new ProductController(model, view);
        controller.runApp();
    }
}