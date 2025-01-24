package dev.pawel.ppjwyklad;

public class App {
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "BUZZ";
    private final static String FIZZ_BUZZ = "FizzBuzz";

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(FIZZ_BUZZ);
            else if (i % 3 == 0)
                System.out.println(FIZZ);
            else if (i % 5 == 0)
                System.out.println(BUZZ);
            else
                System.out.println(i);
        }
    }
}
