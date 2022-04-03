package by.epam.golubev.consol.textanalysis.application.dao.impl;

import java.util.ArrayList;
import java.util.List;

public class ListParagraphsImpl {

    private final List<String> paragraphs = new ArrayList<>();
    private static final ListParagraphsImpl INSTANCE = new ListParagraphsImpl();

    private ListParagraphsImpl() {

    }


    public void addParagraph(String paragraph) {
        paragraphs.add(paragraph);
    }

    public static ListParagraphsImpl getInstance() {
        return INSTANCE;
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }
    public int getSize(){ return paragraphs.size();}
    public void showElem(){
        if (paragraphs.isEmpty()){
        for (int i = 0; i < paragraphs.size(); i++) {
            System.out.println("Абзац №" + i + ":" + paragraphs.get(i));
        }
        }else {
            System.out.println("Параграфов нет");}
    }
    public void deleteElem(){
        paragraphs.removeAll(paragraphs);
        }
    }


