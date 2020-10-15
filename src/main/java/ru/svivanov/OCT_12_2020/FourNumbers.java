package ru.svivanov.OCT_12_2020;

public class FourNumbers {


    public static void main(String[] args) {
        short[][] matrix = {{0,1},{0,1,2},{0,1,2,3,4},{0,1,2,3}};
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
                if(matrix[i][j]==2){
                    break;
                }
            }
            continue;
        }
    }




}

