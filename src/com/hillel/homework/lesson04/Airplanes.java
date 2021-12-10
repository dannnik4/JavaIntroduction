package com.hillel.homework.lesson04;

public class Airplanes {

    public static void main(String[] args) {

        String typeAir1 = "Jet";
        String typeAir2 = "Airliner";
        String modelAir1 = "F-22 Raptor";
        String modelAir2 = "Aerobus 737";
        String modelAir3 = "Boeing 777";
        int Econom1 = 120;
        int Econom2 = 180;
        int Business = 28;

        String printAirplaneInfo1 = printAirplaneInfo(typeAir1, modelAir1);
        String printAirplaneInfo2 = printAirplaneInfo(typeAir2, modelAir2, Econom1);
        String printAirplaneInfo3 = printAirplaneInfo(typeAir2, modelAir3, Econom2, Business);

        System.out.println(printAirplaneInfo1);
        System.out.println(printAirplaneInfo2);
        System.out.println(printAirplaneInfo3);

    }

    public static String printAirplaneInfo(String typeAir1, String modelAir1) {

        return "Тип самолёта: " + typeAir1 + ", модель : " + modelAir1;

    }

    public static String printAirplaneInfo(String typeAir2, String modelAir2, int Econom1) {

        return "Тип самолёта: " + typeAir2 + ", модель : " + modelAir2 + ", кол-во пассажиров эконом класса : " + Econom1;

    }

    public static String printAirplaneInfo(String typeAir2, String modelAir2, int Econom2, int Business) {

        return "Тип самолёта: " + typeAir2 + ", модель : " + modelAir2 + ", кол-во пассажиров эконом класса : " + Econom2 + ", кол-во пассажиров бизнес класса : " + Business;

    }

}