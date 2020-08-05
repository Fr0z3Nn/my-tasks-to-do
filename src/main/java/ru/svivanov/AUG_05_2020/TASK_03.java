package ru.svivanov.AUG_05_2020;

public class TASK_03 {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1, 2, 3}, {1, 3, 4}, {2, 4, 6}}));
    }
    public static int solve(int [][] arr){
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < arr[0].length; j++){
            int i = 0;
            int multi = arr[i][0];
            for(; i<arr.length; i++){
                multi *= arr[i][j];
            }
            max = Math.max(multi, max);
        }return max;
    }
}
