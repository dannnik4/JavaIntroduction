package com.hillel.classwork.lesson05;

public class Truck {

    public static int TRUCK_COUNT = 0;
    //public static final int TRUCK_MAX_WEIGHT = 58;

    public static void main(String[] args) {

        int length = 10;
        int width = 40;
        int height = 78;
        int volume = calculateVolume(length, width, height);
        print(volume);

        int Weight = 58;
        int totalWeight = calculateTotalWeight(volume, Weight);
        print(totalWeight);

    }

    private static void print(int volume) {
        System.out.println(volume);
    }

    public static int calculateVolume(int length, int width, int height) {
        int volume = length * width * height;
        return volume;
    }

    public static int calculateTotalWeight(int volume, int Weight) {
        return volume * Weight;
    }

}