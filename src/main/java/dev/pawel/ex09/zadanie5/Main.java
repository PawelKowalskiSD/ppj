package dev.pawel.ex09.zadanie5;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.addChar('a');
        world.addChar('a');
        world.addChar('a');
        world.show();
        System.out.println(world.length());
        world.addChar('b');
        world.addChar('b');
        world.addChar('b');
        world.show();
        System.out.println(world.length());
    }
}
