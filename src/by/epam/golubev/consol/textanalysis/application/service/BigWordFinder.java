package by.epam.golubev.consol.textanalysis.application.service;

import java.util.Scanner;

public class BigWordFinder {


    public String findBigWord(Scanner scanner) {
        String bigWord = null;
        int biggestSizeOfWord = 0;
        String[] splitWords;
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()) {

            stringBuilder.append(scanner.nextLine());
            String[] words = stringBuilder.toString().split("\s");
            for (String s : words) {
                splitWords = s.split("[\\s><|.!?:(),=\\d\\\\\"&~^']");
                for (String word : splitWords) {
                    if (word.length() > biggestSizeOfWord) {
                        bigWord = word;
                        biggestSizeOfWord = word.length();
                    }
                }
            }
        }
        System.out.println("Длинное слово " + biggestSizeOfWord + " " + bigWord);
        return bigWord;
    }
}


