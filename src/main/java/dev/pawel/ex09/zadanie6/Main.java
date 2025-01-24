package dev.pawel.ex09.zadanie6;

public class Main {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("abc, abd, ad, a");
        System.out.println(sentence.countWords());
        System.out.println(sentence.getSentence());
        System.out.println(sentence.getShortestWord());
        System.out.println(sentence.getLongestWord());
        System.out.println(sentence.getLargestWord());
        System.out.println(sentence.getSmallestWord());

    }
}
