package dev.pawel.ex06;

public class Zadanie2 {
    public static void main(String[] args) {
        char []arr = new char[3];
        int index = -1;
        int smallValue = 'Z';
        arr[0] = 'B';
        arr[1] = 'A';
        arr[2] = 'F';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallValue) {
                smallValue = arr[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
