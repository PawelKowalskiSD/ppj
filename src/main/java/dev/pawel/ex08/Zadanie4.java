package dev.pawel.ex08;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("max value is: " + findMax(5, 10, 2));
        System.out.println("Min value is: " + findMin(9, 4, 5));
    }

    public static int findMax(int firstValue, int secondValue, int thirdValue) {
        int max = firstValue;
        if (max < secondValue)
            max = secondValue;
        else if (max < thirdValue)
            max = thirdValue;
        return max;
    }

    public static int findMin(int firstValue, int secondValue, int thirdValue) {
        int min = firstValue;
        if (min > secondValue)
            min = secondValue;
        else if (min > thirdValue)
            min = thirdValue;
        return min;
    }
}
