package dev.pawel.ex08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie8 {
    private final static int DEFAULT_CAPACITY = 10;
    private static int SIZE;

    public static void show(int[] displayMainArray) {
        System.out.println(Arrays.toString(displayMainArray));
    }

    public static void roll(int[] displayMainArray) {
        int[] array = {new Random().nextInt(1, 7), new Random().nextInt(1, 7)};
        System.out.println(Arrays.toString(array));
        int len = SIZE + 2;
        int count = 0;

        for (int i = SIZE; i < len; i++) {
            displayMainArray[i] = array[count];
            SIZE++;
            System.out.println(SIZE);
            System.out.println(displayMainArray.length);
            if (count == 1)
                return;
            count++;
        }
    }

    public static int[] copyArray(int[] oldArray) {
        int[] newArray = resize(oldArray);
        for (int i = 0; i < oldArray.length; i++)
            newArray[i] = oldArray[i];
        return newArray;
    }

    public static boolean logic(int[] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write :\n1. (r)oll\n2. (s)how\n3. (e)xit");
        String in = input.nextLine();
        if (!(in.equalsIgnoreCase("r")
                || in.equalsIgnoreCase("s")
                || in.equalsIgnoreCase("e")))
            System.out.println("Try Again");
        else {
            if (in.equalsIgnoreCase("r"))
                roll(array);
            if (in.equalsIgnoreCase("s"))
                show(array);
            if (in.equalsIgnoreCase("e")) {
                System.out.println("Bye");
                return false;
            }
        }
        return true;
    }

    private static int[] resize(int[] oldArray) {
        int lengthForNewArray = oldArray.length + (oldArray.length / 2);
        return new int[lengthForNewArray];
    }

    public static void main(String[] args) {
        int[] array = new int[DEFAULT_CAPACITY];
        while (logic(array))
            if (SIZE == array.length || SIZE == array.length - 1)
                array = copyArray(array);
    }
}
