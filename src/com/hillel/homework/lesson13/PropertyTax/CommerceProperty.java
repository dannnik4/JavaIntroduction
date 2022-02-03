package com.hillel.homework.lesson13.PropertyTax;

class CommerceProperty extends CalculateTax{

    private double cashBox;

    CommerceProperty(double area, double taxPerOneSquare, double cashBox){
        super(area, taxPerOneSquare);
        this.cashBox = cashBox;
    }

    @Override
    double calculateTaxRealEstate(){
        double cashBox = this.cashBox;
        if (cashBox < 100.0){
            return 0;
        }
        return super.calculateTaxRealEstate();
    }

    @Override
    public String toPrint(double taxRealEstate) {
        return "Налоги к оплате на торговую недвижимость: " + taxRealEstate + " грн";
    }
}