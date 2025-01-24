package dev.pawel.ex07;

import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        float[][] array = new float[8][8];
        Random rand = new Random();
        double sumOfLeftDiagonal = 0.0;
        double sumOfRightDiagonal = 0.0;
        int leftPoint = 0;
        int rightPoint = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextFloat(0.0f, 10.0f);
                if (j < array[i].length - 1) {
                    System.out.printf("%.2f ", array[i][j]);
                } else {
                    System.out.printf("%.2f", array[i][j]);
                }
            }
            sumOfLeftDiagonal += array[i][leftPoint++];
            sumOfRightDiagonal += array[i][rightPoint--];
            System.out.println("]");
        }
        double sumOfLeftAndRightDiagonal = sumOfLeftDiagonal + sumOfRightDiagonal;
        System.out.printf("\nThis is sum of left diagonal: %.2f\n", sumOfLeftDiagonal);
        System.out.printf("This is sum of right diagonal: %.2f\n", sumOfRightDiagonal);
        System.out.printf("This is sum of left and right diagonal: %.2f", sumOfLeftAndRightDiagonal);
    }
}
