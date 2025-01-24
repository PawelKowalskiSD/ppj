package dev.pawel.ex07;

import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80};
        int[] copyArray = Arrays.copyOf(arr, arr.length);
        boolean start = true;

        int count = 0, result = 0;
        while (start) {
            if (copyArray[count] > 0) {
                int modulo = copyArray[count] % 10;
                copyArray[count] = copyArray[count] / 10;
                result += (int) Math.pow(modulo, String.valueOf(arr[count]).length());
            } else {
                if (result == arr[count++])
                    System.out.println("Liczby narcystyczne podane w tablicy to: " + result + ", ");
                result = 0;
            }
            if (count == arr.length)
                start = false;
        }
        System.out.println(Arrays.toString(arr));
    }
}
