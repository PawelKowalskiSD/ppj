package dev.pawel.ex07;

import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        int[] firstArray = new int[rand.nextInt(1, 21)];
        int[] secondArray = new int[rand.nextInt(1, 21)];
        int[] thirdArray = new int[rand.nextInt(1, 21)];
        int[][] output = new int[3][];

        while (count < firstArray.length || count < secondArray.length || count < thirdArray.length) {
            if (count < firstArray.length)
                firstArray[count] = rand.nextInt(0, 200);
            if (count < secondArray.length)
                secondArray[count] = rand.nextInt(0, 200);
            if (count < thirdArray.length)
                thirdArray[count] = rand.nextInt(0, 200);
            count++;
        }
        for (int i = 0; i < output.length; i++) {
            if (i == 0)
                output[i] = new int[firstArray.length];
            else if (i == 1)
                output[i] = new int[secondArray.length];
            else
                output[i] = new int[thirdArray.length];
        }
        for (int i = 0; i < output.length; i++)
            for (int j = 0; j < output[i].length; j++)
                output[i][j] = rand.nextInt(0, 200);

        for (int[] into : output) {
            System.out.print("[");
            for (int j = 0; j < into.length; j++) {
                if (j < into.length - 1)
                    System.out.print(into[j] + " ");
                else
                    System.out.print(into[j]);
            }
            System.out.println("]");
        }
    }
}
