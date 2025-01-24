package dev.pawel.ex08;

public class Zadanie13 {
    public static void main(String[] args) {
        int[] arr = new int[101];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        System.out.println(binarySearch(arr, 33, 0, arr.length - 1));
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (array[mid] == target) return mid;
        if (array[mid] > target) return binarySearch(array, target, left, mid - 1);
        return binarySearch(array, target, mid + 1, right);
    }
}
