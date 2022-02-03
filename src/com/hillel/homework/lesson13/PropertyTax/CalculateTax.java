package com.hillel.homework.lesson13.PropertyTax;

class CalculateTax {

    double area;
    double taxPerOneSquare;

    CalculateTax(double area, double taxPerOneSquare){
        this.area = area;
        this.taxPerOneSquare = taxPerOneSquare;
    }

    double calculateTaxRealEstate(){
        return area * taxPerOneSquare;
    }

    public String toPrint(double taxRealEstate) {
        return "Налоги к оплате: " + taxRealEstate + " грн";
    }

}
