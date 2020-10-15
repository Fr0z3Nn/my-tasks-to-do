package ru.svivanov.OCT_12_2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main implements Runnable{
    String message = "message";

    public Main(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        while (true){
            new Thread(new Main("1")).run();
            new Thread(new Main("2")).run();
            System.out.println("Main END");
        }

    }
}
