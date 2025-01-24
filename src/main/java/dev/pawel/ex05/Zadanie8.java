package dev.pawel.ex05;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        while (start) {
            System.out.println("podaj szerokosc");
            String sze = sc.nextLine();
            System.out.println("podaj wysokosc");
            String wys = sc.nextLine();
            System.out.println("podaj fill");
            String fill = sc.nextLine();
            System.out.println("podaj border");
            String border = sc.nextLine();
            for (int i = 0; i < Integer.parseInt(sze); i++) {
                System.out.print(border);
                for (int j = 0; j < Integer.parseInt(wys) - 1; j++) {
                    if (i == 0 || i == Integer.parseInt(sze) - 1)
                        System.out.print(border);
                    else if (j == Integer.parseInt(wys) - 2)
                        System.out.print(border);
                    else
                        System.out.print(fill);
                }
                System.out.println();
            }
            start = false;
        }
    }
}
