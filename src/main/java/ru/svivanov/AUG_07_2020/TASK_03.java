package ru.svivanov.AUG_07_2020;

import java.util.Arrays;

public class TASK_03 {
    public static void main(String[] args) {
        System.out.println(twoSort(new String[]{"phone", "alfa"}));
    }
    public static String twoSort(String[] s) {
        StringBuilder str = new StringBuilder();
        Arrays.stream(s).sorted().findFirst().get().chars().forEach(i -> str.append((char)i).append("***"));
        str.delete(str.length()-3,str.length());
        return str.toString();
    }
}
