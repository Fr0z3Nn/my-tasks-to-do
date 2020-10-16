package ru.svivanov.OCT_16_2020;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Boolean[] arr = new Boolean[2];
        List<Boolean> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));

    }
}
