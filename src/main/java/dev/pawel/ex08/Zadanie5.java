package dev.pawel.ex08;

public class Zadanie5 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        int[][] arr2 = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        int[][] arr3 = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 2}
        };

        int[][] arr4 = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0}
        };
        System.out.println(isEquals(arr1, arr2));
        System.out.println(isEquals(arr1, arr3));
        System.out.println(isEquals(arr1, arr4));
        System.out.println(isEquals(arr2, arr3));
        System.out.println(isEquals(arr2, arr4));
        System.out.println(isEquals(arr3, arr4));
    }

    public static boolean isEquals(int[][] firstArray, int[][] secondArray) {
        int firstArrayLength = countLength(firstArray);
        int secondArrayLength = countLength(secondArray);

        if (firstArrayLength != secondArrayLength) return false;
        return (checkIsEquals(firstArray, secondArray));
    }

    private static boolean checkIsEquals(int[][] firstArray, int[][] secondArray) {
        for (int i = 0; i < firstArray.length; i++)
            for (int j = 0; j < firstArray[i].length; j++)
                if (firstArray[i][j] != secondArray[i][j]) return false;
        return true;
    }

    private static int countLength(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                count++;
        return count;
    }
}
