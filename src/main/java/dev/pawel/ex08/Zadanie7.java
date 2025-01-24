package dev.pawel.ex08;

import java.util.Arrays;

public class Zadanie7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 4, 6, 2, 1, 0, 6, 9, 1, 2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSort2(arr)));
    }
    public static int[] bubbleSort(int[] array) {
        int count = 0;
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            count++;
            if (array[start] > array[end]) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
            start++;
            if (start == end && end > 1) {
                start = 0;
                end--;
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("bubble sort  -> number of iteration is:  " + count);
        return array;
    }

    public static int[] bubbleSort2(int []arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            for (int j = i + 1; j < arr.length; j++) {
                count++;
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("bubble sort 2 -> number of iteration is: " + count);
        return arr;
    }
}
