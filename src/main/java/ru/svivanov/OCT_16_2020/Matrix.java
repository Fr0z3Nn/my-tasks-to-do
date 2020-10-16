package ru.svivanov.OCT_16_2020;

import java.util.Arrays;

public class Matrix {
    private double[][] matrix;
    private int height;
    private int width;

    public Matrix(int m, int n) {
        this.height = m;
        this.width = n;
        this.matrix = new double[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random(-100, 100);
            }
        }
    }

    public Matrix(double[][] matrix) {
        this.height = matrix.length;
        this.width = matrix[0].length;
        this.matrix = matrix;
    }

    public void reverseMinAndMaxByColumn(int column) {
        double max = matrix[0][column];
        int maxIndex = 0;
        double min = matrix[0][column];
        int minIndex = 0;

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][column] > max) {
                max = matrix[i][column];
                maxIndex = i;
            }
            if (matrix[i][column] < min) {
                min = matrix[i][column];
                minIndex = i;
            }
        }

        double[] temp = matrix[maxIndex];
        matrix[maxIndex] = matrix[minIndex];
        matrix[minIndex] = temp;
    }

    public Matrix squaring() throws Exception {
        if (width != height) {
            throw new Exception("Matrix isn't square");
        }
        double[][] copy = new double[height][width];
        for (int m = 0; m < matrix.length; m++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    copy[m][j] += matrix[m][i] * matrix[i][j];
                }

            }
        }
        return new Matrix(copy);
    }

    public void printMatrix() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf(" %.2f ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public double[][] getMatrix() {
        return matrix;
    }


}

class MainTest {
    public static void main(String[] args) throws Exception {
        Matrix[] matrices = new Matrix[]{new Matrix(3, 3), new Matrix(3, 3), new Matrix(3, 3)};
        for (Matrix matrix : matrices) {
            System.out.println("Matrix before:");
            int column = (int) (Math.random() * matrix.getMatrix()[0].length);
            System.out.printf("column: %d\n", column);
            matrix.printMatrix();
            matrix.reverseMinAndMaxByColumn(column);
            System.out.println("Matrix after:");
            matrix.printMatrix();
        }

        System.out.println("Squaring random 3x3 matrix:");
        Matrix matrix = new Matrix(3, 3);
        matrix.printMatrix();
        matrix.squaring().printMatrix();

    }

}

