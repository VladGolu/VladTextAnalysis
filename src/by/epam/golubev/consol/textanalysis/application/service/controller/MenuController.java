package by.epam.golubev.consol.textanalysis.application.service.controller;

import by.epam.golubev.consol.textanalysis.application.dao.impl.ListParagraphsImpl;
import by.epam.golubev.consol.textanalysis.application.dao.impl.ListSentencesImpl;
import by.epam.golubev.consol.textanalysis.application.service.*;
import by.epam.golubev.consol.textanalysis.application.view.TextAnalysisMenu;

import java.util.ArrayList;

public class MenuController {

    TextFileReader textFileReader = new TextFileReader();
    TextAnalysisMenu textAnalysisMenu = new TextAnalysisMenu();
    TextSplitter textToArray = new TextSplitter();
    ListParagraphsImpl paragraphs = ListParagraphsImpl.getInstance();
    ListSentencesImpl sentences = ListSentencesImpl.getInstance();


    public void createController(int customerChoice) {


        switch (customerChoice) {
            case 1 -> {
                ParagraphFinder finderParagraph = new ParagraphFinder();
                finderParagraph.sortParagraphBySize(textFileReader.readTextFile());
                textFileReader.closeScanner(textFileReader.readTextFile());
                createController(textAnalysisMenu.createMenu());
            }
            case 2 -> {
                BigWordFinder finderBigWord = new BigWordFinder();
                textToArray.splitToParagraphsArray(textFileReader.readTextFile());
                textToArray.splitToSentencesArray((ArrayList<String>) paragraphs.getParagraphs());
                textToArray.findSentencesWithBigWord((ArrayList<String>) sentences.getSentences(), finderBigWord.findBigWord(textFileReader.readTextFile()));
                paragraphs.deleteElem();
                sentences.deleteElem();
                textFileReader.closeScanner(textFileReader.readTextFile());
                createController(textAnalysisMenu.createMenu());

            }
            case 3 -> {
                CountOfWordInSentence countOfWordInSentence = new CountOfWordInSentence();
                textToArray.splitToParagraphsArray(textFileReader.readTextFile());
                textToArray.splitToSentencesArray((ArrayList<String>) paragraphs.getParagraphs());
                countOfWordInSentence.DeleteFromTextSentencesWithNumberOfWordsLessThanSpecifiedOne((ArrayList<String>) sentences.getSentences());
                paragraphs.deleteElem();
                sentences.deleteElem();
                textFileReader.closeScanner(textFileReader.readTextFile());
                createController(textAnalysisMenu.createMenu());
            }
            case 4 -> {
                SameWordsFinder sameWordsSearcher = new SameWordsFinder();
                sameWordsSearcher.findSameWords(textFileReader.readTextFile());
                textFileReader.closeScanner(textFileReader.readTextFile());
                createController(textAnalysisMenu.createMenu());

            }
            case 5 -> {

                textToArray.splitToParagraphsArray(textFileReader.readTextFile());
                textToArray.splitToSentencesArray((ArrayList<String>) paragraphs.getParagraphs());
                textToArray.findingTheCountsOfVowelsInSentence((ArrayList<String>) sentences.getSentences());
                paragraphs.deleteElem();
                sentences.deleteElem();
                textFileReader.closeScanner(textFileReader.readTextFile());
                createController(textAnalysisMenu.createMenu());
            }
            case 6 -> {
                System.out.print("\nВы вышли из программы");
                System.exit(0);
            }
            default -> {
                System.out.println("Неверное значение, попробуйте снова");
                createController(textAnalysisMenu.createMenu());
            }
        }
    }
}
