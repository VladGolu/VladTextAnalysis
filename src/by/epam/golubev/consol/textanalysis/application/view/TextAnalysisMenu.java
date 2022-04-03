package by.epam.golubev.consol.textanalysis.application.view;

import by.epam.golubev.consol.textanalysis.application.service.ConsoleService;

import java.util.Scanner;

public class TextAnalysisMenu {
    private final Scanner menu = new Scanner(System.in);
    ConsoleService consoleService = new ConsoleService();

    public int createMenu(){
        consoleService.ConsoleForMenu();
        return Integer.parseInt(menu.next());
    }
}
