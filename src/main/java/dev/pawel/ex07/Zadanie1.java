package dev.pawel.ex07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Podaj rozmiar tablicy: ");
        int length = sc.nextInt();
        int temp = 0;
        int index = 0;
        int[] arr = new int[length];
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(0, 50);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr2[index++] = arr[i];
                temp = arr[i];
                continue;
            }
            if (temp != arr[i]) {
                arr2[index++] = arr[i];
                temp = arr[i];
            }
        }
        for (int i = 0; i < index; i++) {
            if (i == 0)
                System.out.print("[" + arr2[i] + ", ");
            else if (i < index - 1)
                System.out.print(arr2[i] + ", ");
            else
                System.out.println(arr2[i] + "]");
        }
    }
}
