package by.epam.golubev.consol.textanalysis.application;

import by.epam.golubev.consol.textanalysis.application.service.controller.MenuController;
import by.epam.golubev.consol.textanalysis.application.view.TextAnalysisMenu;

public class Main {
    public static void main(String[] args) {
        TextAnalysisMenu textAnalysisMenu = new TextAnalysisMenu();
        MenuController menuController = new MenuController();
        menuController.createController(textAnalysisMenu.createMenu());
    }
}
