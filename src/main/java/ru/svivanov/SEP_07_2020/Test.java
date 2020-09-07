package ru.svivanov.SEP_07_2020;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите вариант:");
            array.add(scan.nextLine());
            System.out.println("Еще один вариант?(y / n)");
        } while (!scan.nextLine().equals("n"));
        System.out.printf("Твой выбор на сегодня: %s", array.get((int) (Math.random() * array.size())));

    }
}
