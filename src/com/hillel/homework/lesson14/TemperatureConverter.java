package com.hillel.homework.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введите температуру по Цельсию:");
        double temperature = Double.parseDouble(READER.readLine());
        System.out.println("В какую шкалу перевести: 'f' - Фаренгейт, 'k' - Кельвин");
        String convertType = READER.readLine();
        Converter Converted = Convert(temperature, convertType);
        Converter converted = Converted;
        converted.convert();
        Converted.print();
    }

    double ConvertValue() throws IOException {
        double temperature = Double.parseDouble(READER.readLine());
        if (temperature < -273.15){
            System.out.println("Температура по цельсию не может быть ниже абсолютного нуля -273.15");
            return ConvertValue();
        }
        return temperature;
    }

    String ConvertType() throws IOException {
        String convertType = READER.readLine().trim();
        if (!convertType.equalsIgnoreCase("k") && !convertType.equalsIgnoreCase("f")) {
            System.out.println("Введена неправильная буква");
            return ConvertType();
        }
        convertType = convertType.toLowerCase();
        return convertType;
    }

    static Converter Convert(double temperature, String convertType) {
        Converter converted = null;
        switch (convertType) {
            case "k":
                converted = new Kelvin(temperature);
                break;
            case "f":
                converted = new Farengate(temperature);
                break;
        }
        return converted;
    }

}
