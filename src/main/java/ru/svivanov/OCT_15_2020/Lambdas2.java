package ru.svivanov.OCT_15_2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        System.out.println(map.put("123", 56));
        System.out.println(map.put("345",89));
        System.out.println(map.put("123", 76));

        Set<String> set = new HashSet<>();
        System.out.println(set.add("private"));
        System.out.println(set.add("private"));
    }

}
