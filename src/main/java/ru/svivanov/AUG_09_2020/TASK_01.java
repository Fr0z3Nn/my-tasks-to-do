package ru.svivanov.AUG_09_2020;

import java.util.Arrays;

public class TASK_01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(1235)));
    }

    public static int[] digitize(long n) {
        String[] arr = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = Integer.parseInt(arr[i]);
        }
        return res;
    }
}
