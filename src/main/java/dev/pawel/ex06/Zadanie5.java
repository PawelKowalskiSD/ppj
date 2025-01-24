package dev.pawel.ex06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int start = 0;
        int counter = 0;
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (char) rand.nextInt('A', 'Z' + 1);
        System.out.println(Arrays.toString(arr));
        char ch = sc.next().charAt(0);
        while (start < arr.length) {
            if (ch == arr[start]) {
                arr[start] = 0;
                counter++;
            }
            start++;
        }
        System.out.println("character equals: " + counter);
        System.out.println("final array: " + Arrays.toString(arr));
    }
}