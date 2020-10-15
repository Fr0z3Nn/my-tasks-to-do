package ru.svivanov.OCT_15_2020;

import java.util.HashMap;
import java.util.Map;

public class Lambdas {
    interface Printer{
        void print(String msg);
    }

    public static void main(String[] args) {
        Runnable runs = new Runnable() {
            @Override
            public void run() {
                System.out.println("HELLO");
            }
        };
        Runnable runs2 = () -> System.out.println("Hello");
        //////////////////////////////////////////////////
        Printer printer = new Printer() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printer.print("HYPE");
        ////////////////////////////////////////
        Printer lambdaPrinter = (m) -> System.out.println(m);
        Printer methodReference = System.out::println;
        lambdaPrinter.print("hi");
        //////////////////////////////////////////////////////
        Map<String,Printer> printerMap = new HashMap<>();
        printerMap.put("lambda", lambdaPrinter);
        printerMap.put("second", m -> {
            System.out.println("//////");
            System.out.println(m);
            System.out.println("//////");
        });
        printerMap.get("lambda").print("HELLO");
        printerMap.get("second").print("STOP");
    }
}
