package dev.pawel.ex06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int start = 0;
        int trueCounter = 0;
        int falseCounter = 0;
        System.out.println("write number: ");
        int length = sc.nextInt();
        boolean[] arr = new boolean[length];
        while (start < length) {
            arr[start] = rand.nextBoolean();
            if (arr[start])
                trueCounter++;
            else
                falseCounter++;
            start++;
        }
        boolean[] onlyTrueValue = new boolean[trueCounter];
        boolean[] onlyFalseValue = new boolean[falseCounter];
        start = 0;
        trueCounter = 0;
        falseCounter = 0;
        while (start < length) {
            if (arr[start]) {
                onlyTrueValue[trueCounter] = arr[start];
                trueCounter++;
            } else {
                onlyFalseValue[falseCounter] = arr[start];
                falseCounter++;
            }
                start++;
        }
        System.out.println("first declaration is: "+ length + " -> " + Arrays.toString(arr));
        System.out.println("only true value is: " + trueCounter + " -> " + Arrays.toString(onlyTrueValue));
        System.out.println("only false value is: " + falseCounter + " -> " + Arrays.toString(onlyFalseValue));
    }
}
