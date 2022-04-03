package by.epam.golubev.consol.textanalysis.application.service;

import by.epam.golubev.consol.textanalysis.application.dao.impl.ListParagraphsImpl;
import by.epam.golubev.consol.textanalysis.application.dao.impl.ListSentencesImpl;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TextSplitter {


    public void splitToParagraphsArray(Scanner scanner) {
        ListParagraphsImpl paragraphs = ListParagraphsImpl.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        String[] paragraph = null;
        while (scanner.hasNext()) {

            stringBuilder.append(scanner.nextLine());
            paragraph = stringBuilder.toString().split("\s {4}");

        }
        for (int i = 0; i < Objects.requireNonNull(paragraph).length; i++) {

            paragraphs.addParagraph(paragraph[i]);
        }

    }

    public void splitToSentencesArray(ArrayList<String> paragraph) {

        ListSentencesImpl sentences = ListSentencesImpl.getInstance();
        String[] sentencesInParagraph;

        for (String value : paragraph) {

            sentencesInParagraph = value.split("[!.?]\s");

            for (String s : sentencesInParagraph) {
                sentences.addSentence(s);
            }
        }
    }

    public void findSentencesWithBigWord(ArrayList<String> sentences, String biggestWord) {

        for (String s : sentences) {
            String[] words = s.split("\s");
            for (String word : words) {
                if (word.equals(biggestWord)) {
                    System.out.println("Предложение с самым длинным словом:" + s);

                }
            }
        }
    }

    public void findingTheCountsOfVowelsInSentence(ArrayList<String> sentences) {

        String[] consonantLetters;
        String[] vowelLetters;
        String sentenceInLowerCase;

        for (String sentence : sentences) {
            int NumberOfConsonantLettersInASentence = 0;
            int NumberOfVowelLettersInASentence = 0;
            sentenceInLowerCase = sentence.toLowerCase();
            vowelLetters = sentenceInLowerCase.split("[бвгджзйклмнпрстфхцчшщbtphdvmnwlsfckrjdzg.!?, ()12345678910~|&><^'-]");
            consonantLetters = sentenceInLowerCase.split("[aeiouyаеёиоуыэюя .!?,()12345678910~|&><^'-]");

            for (String consonantLetter : consonantLetters) {
                NumberOfConsonantLettersInASentence = NumberOfConsonantLettersInASentence + consonantLetter.length();
            }

            for (String vowelLetter : vowelLetters) {
                NumberOfVowelLettersInASentence = NumberOfVowelLettersInASentence + vowelLetter.length();
            }

            System.out.println("Количество согласных = " + NumberOfConsonantLettersInASentence + " Количество гласных " + NumberOfVowelLettersInASentence + " в предложении " + sentence);

        }
    }
}



