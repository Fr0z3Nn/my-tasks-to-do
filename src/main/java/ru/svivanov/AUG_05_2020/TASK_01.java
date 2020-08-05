package ru.svivanov.AUG_05_2020;

public class TASK_01 {
    public static void main(String[] args) {
        System.out.println(solve("coDe"));
    }

    public static String solve(final String str) {
        int up = 0, low = 0;
        for (char item : str.toCharArray()) {
            if (Character.isUpperCase(item)) {
                up++;
            } else {
                low++;
            }
        }
        return up > low ? str.toUpperCase() : str.toLowerCase();
    }
}
