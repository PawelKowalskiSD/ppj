package dev.pawel.ex04;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setA = "A = (-15, -10] " + "( -5, 0) " + " (-5, 10)";
        String setB = "B = (-" + '\u221E' + ", -13] " + " (-8, -3]";
        String setC = "C = [-4, " + '\u221E' + ")";

        boolean start = true;
        while (start) {
            System.out.println("************************");
            System.out.println("--> We have tree set: ");
            System.out.println("*************************************");
            System.out.println("* " + setA + " *");
            System.out.println("* " + setB + "           *");
            System.out.println("* " + setC + "                       *");
            System.out.println("*************************************");
            System.out.println("--> If you want exit program write EXIT and (y/n) <--");
            System.out.println("--> Write number: ");
            String wrt = scanner.nextLine();
            try {
                if (wrt.trim().equalsIgnoreCase("exit")) {
                    System.out.println("Do you want to exit the program? (y/n)");
                    if (scanner.nextLine().trim().equalsIgnoreCase("y"))
                        start = false;
                } else {
                    int number = Integer.parseInt(wrt);
                    boolean checkSetA = ((number > -15 && number <= -10) || (number > -5 && number < 0) || (number > 5 && number < 10));
                    boolean checkSetB = ((number <= -13) || (number > -8 && number <= -3));
                    boolean checkSetC = (number >= -4);
                    if (checkSetA && checkSetB && checkSetC)
                        System.out.println("the number " + wrt + " belongs to all set.");
                    else
                        System.out.println("the number " + wrt + " does not belong to all set.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or valid string ,,exit'' ");
            }
        }
        scanner.close();
    }
}
