package dev.pawel.extra;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayBuilder arrayBuilder = new ArrayBuilder();
        IndexFinder indexFinder = new IndexFinder(3);
        MinFinder minFinder = new MinFinder();
        MaxFinder maxFinder = new MaxFinder();
        SortedDoublyLinkedList sortedDoublyLinkedList = new SortedDoublyLinkedList();
        sortedDoublyLinkedList.add(new Student("g", "g", 7));
        sortedDoublyLinkedList.add(new Student("a", "a", 1));
        sortedDoublyLinkedList.add(new Student("x", "x", 22));
        sortedDoublyLinkedList.add(new Student("b", "b", 2));
        sortedDoublyLinkedList.add(new Student("d", "d", 4));
        sortedDoublyLinkedList.add(new Student("k", "k", 11));
        sortedDoublyLinkedList.add(new Student("e", "e", 5));
        sortedDoublyLinkedList.add(new Student("j", "j", 10));
        sortedDoublyLinkedList.add(new Student("f", "f", 6));
        sortedDoublyLinkedList.add(new Student("h", "h", 8));
        sortedDoublyLinkedList.add(new Student("u", "u", 20));
        sortedDoublyLinkedList.add(new Student("i", "i", 9));
        sortedDoublyLinkedList.add(new Student("l", "l", 12));
        sortedDoublyLinkedList.add(new Student("s", "s", 18));
        sortedDoublyLinkedList.add(new Student("w", "w", 21));
        sortedDoublyLinkedList.add(new Student("m", "m", 13));
        sortedDoublyLinkedList.add(new Student("c", "c", 3));
        sortedDoublyLinkedList.add(new Student("p", "p", 16));
        sortedDoublyLinkedList.add(new Student("n", "n", 14));
        sortedDoublyLinkedList.add(new Student("o", "o", 15));
        sortedDoublyLinkedList.add(new Student("t", "t", 19));
        sortedDoublyLinkedList.add(new Student("r", "r", 17));
        System.out.println(sortedDoublyLinkedList);
        System.out.println(sortedDoublyLinkedList.size());
        sortedDoublyLinkedList.supplyTo(indexFinder);
        sortedDoublyLinkedList.supplyTo(minFinder);
        sortedDoublyLinkedList.supplyTo(maxFinder);
        sortedDoublyLinkedList.supplyTo(arrayBuilder);
        System.out.println(Arrays.toString(arrayBuilder.getStudents()));
        System.out.println("max finder: " + maxFinder.getTrackedStudent());
        System.out.println("min finder: " + minFinder.getTrackedStudent());
        System.out.println("index find: " + indexFinder.getTrackedStudent());
        System.out.println("teraz revers");
        sortedDoublyLinkedList.reverse();
        sortedDoublyLinkedList.removeAt(11);

        sortedDoublyLinkedList.add(new Student("t", "t", 19));
        sortedDoublyLinkedList.add(new Student("x", "x", 22));
        sortedDoublyLinkedList.add(new Student("x", "x", 22));
        sortedDoublyLinkedList.add(new Student("x", "x", 22));
        sortedDoublyLinkedList.add(new Student("a", "a", 1));
        sortedDoublyLinkedList.add(new Student("a", "a", 1));
        sortedDoublyLinkedList.add(new Student("t", "t", 19));
        sortedDoublyLinkedList.add(new Student("a", "a", 1));
           sortedDoublyLinkedList.removeLast();
        System.out.println(sortedDoublyLinkedList);
        sortedDoublyLinkedList.supplyTo(indexFinder);
        sortedDoublyLinkedList.supplyTo(minFinder);
        sortedDoublyLinkedList.supplyTo(maxFinder);
        sortedDoublyLinkedList.supplyTo(arrayBuilder);
        System.out.println(Arrays.toString(arrayBuilder.getStudents()));
        System.out.println("max finder: " + maxFinder.getTrackedStudent());
        System.out.println("min finder: " + minFinder.getTrackedStudent());
        System.out.println("index find: " + indexFinder.getTrackedStudent());
        System.out.println(sortedDoublyLinkedList.size());
   }
}
