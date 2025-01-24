package dev.pawel.ex09.zadanie5;

public class World {
    private final char[] chars;
    private int size;

    public World() {
        chars = new char[100];
        size = 0;
    }

    public boolean addChar(char c) {
        if (chars.length > size) {
            chars[size++] = c;
            return true;
        }
        return false;
    }

    public void show() {
        if (size > 0) {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                if (i < size - 1)
                    System.out.print(chars[i] + ", ");
                else
                    System.out.print(chars[i]);
            }
        } else
            System.out.print("[");
        System.out.println("]");
    }

    public int length() {
        return size;
    }
}
