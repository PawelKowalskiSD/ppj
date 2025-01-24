package dev.pawel.ex09.zadanie8;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        System.out.println("size: " + linkedList.size());
        linkedList.set(3, 10);
        System.out.println(linkedList);
        System.out.println("size: " + linkedList.size());

    }

}
