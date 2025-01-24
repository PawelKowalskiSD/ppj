import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomowaLiczba = new Random();
        int start = 0;
        int licznik = 0;
        char[] tablicaLiter = new char[5];
        for (int i = 0; i < tablicaLiter.length; i++) {
            tablicaLiter[i] = (char) randomowaLiczba.nextInt('A', 'Z' + 1);
        }
        System.out.println(Arrays.toString(tablicaLiter));
        char ch = sc.next().charAt(0);
        while (start < tablicaLiter.length) {
            if (ch == tablicaLiter[start]) {
                tablicaLiter[start] = 0;
                licznik++;
            }
            start++;
        }
        System.out.println("tyle znaków bylo takich samych: " + licznik);
        System.out.println("tablica koncowa: " + Arrays.toString(tablicaLiter));
    }
}
