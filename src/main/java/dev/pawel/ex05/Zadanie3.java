package dev.pawel.ex05;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = sc.nextInt();
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.print(i + " ");
        }
    }
}
