package dev.pawel.ex05;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int minNumber = 0;
        int maxNumber = 100_000;
        boolean start = true;
        while (start) {
            System.out.println("write number between 0 and 100_000");
            int number = sc.nextInt();
            if (number < 0 || number > 100_000)
                System.out.println("number out of range");
            else {
                while (minNumber <= maxNumber) {
                    count++;
                    int midNumber = (minNumber + maxNumber) / 2;
                    if (number == midNumber) {
                        System.out.println("number is kombination is: " + count);
                        break;
                    } else if (number > midNumber)
                        minNumber = midNumber + 1;
                    else
                        maxNumber = midNumber - 1;
                }
                start = false;
            }
        }
    }
}
