package ru.svivanov.AUG_05_2020;

public class TASK_03 {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{10, -15}, {-1, -3}}));
    }

    public static int solve(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < arr[0].length; j++) {
            int i = 0;
            int multi = arr[i][j];
            for (; i < arr.length - 1; i++) {
                multi *= arr[i + 1][j];
            }
            max = Math.max(multi, max);
        }
        return max;
    }
}
