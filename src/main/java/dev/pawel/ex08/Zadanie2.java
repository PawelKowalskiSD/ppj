package dev.pawel.ex08;

public class Zadanie2 {
    public static void main(String[] args) {
        sayHello("Pablo");
        ile(true);
        System.out.println(agree());
    }

    public static void sayHello(String username) {
        System.out.println("Hello " + username + "!");
    }

    public static void ile(boolean isTrue) {
        System.out.println("No is: " + !isTrue);
    }

    public static boolean agree() {
        return true;
    }

}
