package com.hillel.homework.lesson13.PropertyTax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PropertyTax {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введите площадь: (кв. м)");
        double area = Double.parseDouble(READER.readLine());
        System.out.println("Введите налог на один квадратный метр: (грн)");
        double taxPerOneSquare = Double.parseDouble(READER.readLine());
        CalculateTax tax = taxSelecror(area, taxPerOneSquare);
        System.out.println(tax.toPrint(tax.calculateTaxRealEstate()));
    }

    static CalculateTax taxSelecror(double area, double taxPerOneSquare) throws IOException {
        CalculateTax tax = null;
        double subsidy = 0;
        double cashBox = 0;
        System.out.println("1: Жилая недвижимость (процент который нужно заплатить от общей суммы налогов)");
        System.out.println("2: Торговая недвижимсть (если выручка меньше 100 грн то налог не взымается)");
        System.out.println("3: Производственная недвижимость (никаких льгот не предусмотрено)");
        String chooser = READER.readLine();
        switch(chooser){
            case "1":
                System.out.println("Введите процент который нужно заплатить по субсидии");
                subsidy = (Double.parseDouble(READER.readLine()) / 100.0);
                break;
            case "2":
                System.out.println("Введите выручку по кассе для расчета налогов");
                cashBox = Double.parseDouble(READER.readLine());
                break;
            case "3":
                break;
            default:
                System.out.println("Неверно введён параметр");
                tax = taxSelecror(area, taxPerOneSquare);
        }
        tax = toTaxes(chooser, area, taxPerOneSquare, cashBox, subsidy);
        return tax;
    }

    static CalculateTax toTaxes(String key, double area, double taxPerOneSquare, double cashBox, double subsidy) throws IOException {
        CalculateTax tax = null;
        switch(key){
            case "1":
                tax = new ResidentProperty(area, taxPerOneSquare, subsidy);
                break;
            case "2":
                tax = new CommerceProperty(area, taxPerOneSquare, cashBox);
                break;
            case "3":
                tax = new IndustryProperty(area, taxPerOneSquare);
                break;
            default:
                break;
        }
        return tax;
    }

}