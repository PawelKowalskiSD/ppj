package dev.pawel.ex05;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(Math.multiplyFull(i, n));
        }
    }
}
