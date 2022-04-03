package by.epam.golubev.consol.textanalysis.application.service;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParagraphFinder {

    Map<String, Integer> par = new HashMap<>();

    public void sortParagraphBySize(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        String[] paragraphs = stringBuilder.toString().split("\s {3}");

        for (int i = 1; i < paragraphs.length; i++) {
            par.put(paragraphs[i],
                    countDots(paragraphs[i]));
        }

        par.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

    public int countDots(String s) {
        int dotsCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!') {
                dotsCount++;
            }
        }
        return dotsCount;
    }
}
