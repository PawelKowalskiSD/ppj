package dev.pawel.ex05;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write With loop you need: ");
        int n = sc.nextInt();
        int result = switch (n) {
            case 1 -> {
                int num = sc.nextInt();
                while (num < 10) {
                    System.out.println(num);
                    num++;
                }
                yield num;
            }
                case 2 -> {
                    int num = sc.nextInt();
                    do {
                        System.out.println(num++);
                    } while (num < 10);


                    yield num;

                }
            default -> {
                ;
                yield 1;
            }
        };
    }
}
