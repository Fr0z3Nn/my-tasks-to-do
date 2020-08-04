package ru.svivanov.AUG_04_2020;

public class TASK_01 {
    public static void main(String[] args) {
        System.out.println(tripleTrouble("123", "123", "123"));
    }

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            stringBuilder.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return stringBuilder.toString();
    }
}
