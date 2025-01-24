package dev.pawel.ex06;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,4,3,2,1};
        int start = 0;
        int end = tab.length - 1;
        while (start < end) {
            System.out.println(tab[start++] == tab[end--]);
        }
    }
}
