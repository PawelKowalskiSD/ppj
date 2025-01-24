package dev.pawel.ex09.zadanie6;

public class Sentence {
    private String seriesOfWords;

    public Sentence(String seriesOfWords) {
        this.seriesOfWords = seriesOfWords;
    }

    public String getSentence() {
        return this.seriesOfWords;
    }

    public int countWords() {
        String[] arr = seriesOfWords.split(",");
        return arr.length;
    }

    public String getShortestWord() {
        String s = "";
        String[] arr = seriesOfWords.split(", ");
        for (int i = 0; i < arr.length; i++)
            for (int j = 1 + i; j < arr.length; j++)
                if (arr[i].length() > arr[j].length())
                    s = arr[j];
        return s;
    }

    public String getLongestWord() {
        String s = "";
        String[] arr = seriesOfWords.split(", ");
        for (int i = 0; i < arr.length; i++)
            for (int j = 1 + i; j < arr.length; j++)
                if (arr[i].length() <= arr[j].length())
                    s = arr[j];
        return s;
    }

    public String getSmallestWord() {
        String s = "";
        String[] arr = seriesOfWords.split(", ");
        for (int i = 0; i < arr.length; i++)
            for (int j = 1 + i; j < arr.length; j++)
                if (arr[i].compareTo(arr[j]) > 0)
                    s = arr[j];
        return s;
    }

    public String getLargestWord() {
        String s = "";
        String[] arr = seriesOfWords.split(", ");
        for (int i = 0; i < arr.length; i++)
            for (int j = 1 + i; j < arr.length; j++)
                if (arr[i].compareTo(arr[j]) < 0)
                    s = arr[j];
        return s;
    }
}
