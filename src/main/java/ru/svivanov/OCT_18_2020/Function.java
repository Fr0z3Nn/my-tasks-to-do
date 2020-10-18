package ru.svivanov.OCT_18_2020;

public interface Function {
    void calculate();
    static void printNum() {}
}

class A{
    public static void main(String[] args) {
        Function function = () -> {
            System.out.println(123);
        };
        function.calculate();
        Function.printNum();
    }
}