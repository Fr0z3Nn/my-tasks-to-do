package ru.svivanov.AUG_07_2020;

public class TASK_02 {
    public static void main(String[] args) {
        System.out.println(solution("3224ffs"));
    }
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
