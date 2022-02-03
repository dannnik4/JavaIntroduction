package com.hillel.homework.lesson13.PropertyTax;

class ResidentProperty extends CalculateTax{

    private double subsidy;

    ResidentProperty(double area, double taxPerOneSquare, double subsidy){
        super(area, taxPerOneSquare);
        this.subsidy = subsidy;
    }

    @Override
    double calculateTaxRealEstate(){
        return super.calculateTaxRealEstate() * subsidy;
    }

    @Override
    public String toPrint(double taxRealEstate) {
        return "Налоги к оплате на жилую недвижимость: " + taxRealEstate + " грн";
    }
}