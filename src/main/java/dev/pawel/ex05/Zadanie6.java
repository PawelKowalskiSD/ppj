package dev.pawel.ex05;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        boolean start = true;
        while (start) {
            int n =  sc.nextInt();
            if (n != 0) {
                count++;
                sum += n;
            } else
                start = false;
        }
        System.out.println("wprowadziles: " + count);
        System.out.println("suma= " + sum);
    }
}
