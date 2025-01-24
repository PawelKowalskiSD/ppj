package dev.pawel.ex08;

import java.util.Arrays;

public class Zadanie6 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };
        System.out.println(Arrays.toString(flatten(tab)));
    }

    public static int[] flatten(int[][] arr) {
        int count = 0;
        int len = arr[0].length + arr[1].length + arr[2].length;
        int[] arrOutput = new int[len];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (count < len)
                    arrOutput[count++] = arr[i][j];
        return arrOutput;
    }
}
