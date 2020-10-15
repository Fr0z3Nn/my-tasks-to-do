package ru.svivanov.OCT_15_2020;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    static boolean isLineHaveDuplicatesChar(String line){
        Set<Character> setOfDuplicates = new HashSet<>();
        for (char c : line.toCharArray()){
            if(!setOfDuplicates.add(c)){
                return true;
            }
        }
        return false;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(FindDuplicates.isLineHaveDuplicatesChar("allo"));
        System.out.println(FindDuplicates.isLineHaveDuplicatesChar("top"));
    }
}
