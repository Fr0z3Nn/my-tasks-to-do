package ru.svivanov.AUG_04_2020;

public class TASK_02 {
    public static void main(String[] args) {
        System.out.println(zeroFuel(50.2, 25, 2));
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump / mpg <= fuelLeft;
    }
}
