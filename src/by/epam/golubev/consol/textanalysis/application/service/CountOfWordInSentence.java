package by.epam.golubev.consol.textanalysis.application.service;

import java.util.ArrayList;
import java.util.Scanner;

public class CountOfWordInSentence {
    private final Scanner countOfWordInSentenceScanner = new Scanner(System.in);

    public void DeleteFromTextSentencesWithNumberOfWordsLessThanSpecifiedOne(ArrayList<String> sentences) {
        System.out.println("Введите количество слов");

        int countOfWord = Integer.parseInt(countOfWordInSentenceScanner.next());
        for (String s : sentences) {
            int realSize = 0;
            String[] words = s.split("[\\s><|.!?:(),=\\d\\\\\"&~^']");
            for (String word : words) {
                if ("".equals(word)) {
                    realSize++;
                }

            }
            realSize = words.length - realSize;
            if (realSize > countOfWord) {
                System.out.println(s);
            }
        }
    }
}
