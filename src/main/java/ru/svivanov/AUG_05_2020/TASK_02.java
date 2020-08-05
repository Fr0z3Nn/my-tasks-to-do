package ru.svivanov.AUG_05_2020;

import java.util.stream.IntStream;

public class TASK_02 {
    public static void main(String[] args) {
        System.out.println(solve("123 56 78"));
    }
    public static String solve(String s){
        var str = new StringBuilder(s.replace(" ","")).reverse();
        IntStream.range(0,s.length())
                .filter(i -> s.charAt(i) == ' ')
                .forEach(j -> str.insert(j, " "));
        return str.toString();
    }
}
