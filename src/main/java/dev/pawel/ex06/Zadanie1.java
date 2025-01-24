package dev.pawel.ex06;

import java.util.Arrays;
import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {

        double[] arrDouble = new double[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arrDouble[i] = rand.nextDouble(0, 100);
        }
        System.out.println(Arrays.toString(arrDouble));
        for (int i = 0; i < arrDouble.length; i++) {
            if (i % 2 == 0) {
                System.out.print("index " + i + ". ");
                System.out.printf("{value= %.2f} ", arrDouble[i]);
            }
        }
        for (int i = 0; i < arrDouble.length; i++) {
            int result = (int) arrDouble[i];
            if (result % 2 != 0) {
                System.out.println("index " + i + ". " + result);
            }
        }
    }
}
