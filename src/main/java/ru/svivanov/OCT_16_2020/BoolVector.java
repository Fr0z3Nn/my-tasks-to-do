package ru.svivanov.OCT_16_2020;

import java.util.Arrays;

public class BoolVector {
    private byte[] vector;

    public BoolVector(int vectorLength) {
        this.vector = new byte[vectorLength];
    }

    public BoolVector(byte[] vector) throws Exception {
        for (byte bit : vector) {
            if (bit != 0 && bit != 1) {
                throw new Exception("It isn't BoolVector. Must contain only 0 or 1");
            }
        }
        this.vector = vector;
    }

    public static BoolVector conjunction(BoolVector firstVector, BoolVector secondVector) throws Exception {
        return conjunctionAndDisjunctionLogic(firstVector, secondVector, 1, 1, 1, 0);
    }

    public static BoolVector disjunction(BoolVector firstVector, BoolVector secondVector) throws Exception {
        return conjunctionAndDisjunctionLogic(firstVector, secondVector, 0, 0, 0, 1);
    }

    public BoolVector negationVector() throws Exception {
        byte[] result = new byte[vector.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) (vector[i] == 1 ? 0 : 1);
        }
        return new BoolVector(result);
    }

    public void countingOnesAndZeros() {
        int zero = 0;
        for (byte bit : vector) {
            if (bit == 0) ++zero;
        }
        System.out.printf("Vector has:\n %d Zeros\n %d Ones", zero, vector.length - zero);
    }

    private static BoolVector conjunctionAndDisjunctionLogic(BoolVector firstVector, BoolVector secondVector, int V1, int V2, int R1, int R2) throws Exception {
        byte[] first = firstVector.getVector();
        byte[] second = secondVector.getVector();
        byte[] result = new byte[first.length];
        if (first.length != second.length) {
            throw new Exception("Vectors must be the same length");
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) ((first[i] == V1 && second[i] == V2) ? R1 : R2);
        }
        return new BoolVector(result);
    }

    public byte[] getVector() {
        return vector;
    }


}

class TestBoolVector {
    public static void main(String[] args) throws Exception {
        BoolVector boolVector1 = new BoolVector(new byte[]{0, 1, 1, 1, 1, 0});
        BoolVector boolVector2 = new BoolVector(new byte[]{0, 1, 0, 1, 1, 1});
        System.out.println(Arrays.toString(BoolVector.conjunction(boolVector1, boolVector2).getVector()));
        System.out.println(Arrays.toString(BoolVector.disjunction(boolVector1, boolVector2).getVector()));
        System.out.println(Arrays.toString(boolVector1.negationVector().getVector()));
        boolVector1.countingOnesAndZeros();

    }
}