package by.epam.golubev.consol.textanalysis.application.service;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SameWordsFinder {

    public void findSameWords(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        String str = stringBuilder.toString();
        str = str.replaceAll("\s {4}", "");
        str = str.replaceAll("[.!?:(),=\\d\\\\\"]", "\s");
        String[] strings = str.split(" ");
        System.out.println(Arrays.stream(strings).toList().stream().collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum)));

    }
}

