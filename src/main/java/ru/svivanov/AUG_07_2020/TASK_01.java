package ru.svivanov.AUG_07_2020;

public class TASK_01 {
    public static void main(String[] args) {
        System.out.println(nthPower(new int[]{1, 2, 2, 4}, 2));
    }
    public static int nthPower(int[] array, int n) {
        return array.length-1 >= n ? (int)Math.pow(array[n],n) : -1;
    }
}
