package dev.pawel.ex04;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        int tempNumber = 0;
        int count = 0;
        int sum = 0;
        int[] banknotesForClient = new int[7];
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        while (start) {
            System.out.println("**************************************************************");
            System.out.println("*        **        ***************       **        **        *");
            System.out.println("*       ****       ***************      ****      ****       *");
            System.out.println("*      **  **            **            **  **    **  **      *");
            System.out.println("*     **    **           **           **    **  **    **     *");
            System.out.println("*    **********          **          **      ****      **    *");
            System.out.println("*   ************         **         **        **        **   *");
            System.out.println("*  **          **        **        **                    **  *");
            System.out.println("* **            **       **       **                      ** *");
            System.out.println("**************************************************************");
            System.out.println("--> Welcome <--");
            System.out.println("--> We pay out as much cash as you can carry without a pin <--");
            System.out.println("--> If you don't want money write EXIT and (y/n) <--");
            System.out.println("--> Enter how much cash you need <--");
            String input = scanner.nextLine();
            try {
                if (input.trim().equalsIgnoreCase("exit")) {
                    System.out.println("Do you want to exit the program? (y/n)");
                    if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
                        System.out.println("Goodbye!");
                        start = false;
                    }
                } else {
                    int number = Integer.parseInt(input);
                    while (number != sum && count < banknotes.length) {
                        if (count == 0)
                            tempNumber = number;
                        int result = tempNumber / banknotes[count];
                        sum += result * banknotes[count];
                        banknotesForClient[count] = result;
                        tempNumber = number - sum;
                        count++;
                    }
                    count = 0;
                    while (count < banknotesForClient.length) {
                        if (banknotesForClient[count] > 0)
                            System.out.println("you get " + banknotesForClient[count] + " banknotes in denomination " + banknotes[count] + "$");
                        count++;
                    }
                    System.out.println("you want to make a new transaction? (y/n)");
                    String question = scanner.nextLine();
                    if (question.trim().equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        start = false;
                    } else if (question.trim().equalsIgnoreCase("y")) {
                        sum = 0;
                        count = 0;
                    } else {
                        System.out.println("something went wrong sorry");
                        System.exit(500);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or valid string ,,exit'' ");
            }
        }
        scanner.close();
    }
}