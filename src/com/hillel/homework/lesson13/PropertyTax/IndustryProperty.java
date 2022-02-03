package com.hillel.homework.lesson13.PropertyTax;

class IndustryProperty extends CalculateTax {

    IndustryProperty(double area, double taxPerOneSquare){
        super(area, taxPerOneSquare);
    }

    @Override
    public String toPrint(double taxRealEstate) {
        return "Налоги на производственую недвижимость: " + taxRealEstate + " грн";
    }
}