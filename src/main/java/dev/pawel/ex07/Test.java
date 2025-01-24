package dev.pawel.ex07;

import java.util.Random;

public class Test {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int sum = sum(2, 2);
        System.out.println(sum);
        int sum2 = sum(2, 2);
        System.out.println(sum2);
    }
}
