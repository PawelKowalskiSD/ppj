package dev.pawel.ex08;

import java.util.Arrays;

public class Zadanie12 {
    public static int[] bubbleSortRe(int[] array, int start, int end) {
        if (start >= end) {
            if (end == 0) return array;
            return bubbleSortRe(array, 0, end - 1);
        }
        if (array[start] > array[end]) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
        return bubbleSortRe(array, start + 1, end);
    }

    public static void main(String[] args) {
        int start = 0;
        int[] array = {3, 1, 4, 10, 2, 5, 9, 6};
        System.out.println(Arrays.toString(bubbleSortRe(array, start, array.length - 1)));
    }

}
