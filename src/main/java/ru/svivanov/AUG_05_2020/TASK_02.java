package ru.svivanov.AUG_05_2020;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class TASK_02 {
    public static void main(String[] args) {
        System.out.println(solve("123 56 78"));
    }
    public static String solve(String s){
        ArrayList<Integer> arrayList = new ArrayList<>();
        var stringBuilder = new StringBuilder(s);
        while (stringBuilder.toString().contains(" ")){
            var e = stringBuilder.toString().indexOf(" ");
            arrayList.add(e);
            stringBuilder.deleteCharAt(e);
            System.out.println(stringBuilder.toString());
        }
        stringBuilder.reverse();
        IntStream.iterate(arrayList.size() - 1, i -> i >= 0, i -> i - 1).forEach(i -> stringBuilder.insert(arrayList.get(i), " "));
        return stringBuilder.toString();
    }
}
