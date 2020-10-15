package ru.svivanov.OCT_15_2020;

interface Mathmatic{
    double calculate(int a);
    static double sqrt(double m){
        return Math.sqrt(m);
    }
}

public class Lambdas2 {
    public static void main(String[] args) {
        Mathmatic calculate = number -> Math.sqrt(number) + 2;
        Mathmatic calculate2 = Math::sqrt;
        System.out.println(calculate2.calculate(9));
        Mathmatic.sqrt(54);
        StaticTest.print();
    }
}

class StaticTest{
    static void print(){
        System.out.println("123");
    }
}
