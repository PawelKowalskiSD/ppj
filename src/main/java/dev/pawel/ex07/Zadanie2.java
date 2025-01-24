package dev.pawel.ex07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int arrayLength = sc.nextInt();
        int[] firstArray = new int[arrayLength];
        int[] secondArray = new int[arrayLength];
        boolean firstEqualsElement = false;
        int temp = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rand.nextInt(0, 10);
            secondArray[i] = rand.nextInt(0, 10);
        }
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j] && !firstEqualsElement) {
                    temp = firstArray[i];
                    System.out.print(firstArray[i] + ", ");
                    firstEqualsElement = true;
                }
                if ((firstArray[i] == secondArray[j]) && temp != firstArray[i]) {
                    temp = firstArray[i];
                    if (temp == firstArray[firstArray.length - 1])
                        System.out.println(firstArray[i]);
                    else
                        System.out.print(firstArray[i] + ", ");
                    break;
                }
            }
        }
    }
}
