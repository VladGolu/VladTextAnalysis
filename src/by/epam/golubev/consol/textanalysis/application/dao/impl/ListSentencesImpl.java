package by.epam.golubev.consol.textanalysis.application.dao.impl;

import java.util.ArrayList;
import java.util.List;

public class ListSentencesImpl {

    private final List<String> sentences = new ArrayList<>();
    private static final ListSentencesImpl INSTANCE = new ListSentencesImpl();

    private ListSentencesImpl() {

    }


    public void addSentence(String sentence) {
        sentences.add(sentence);
    }

    public static ListSentencesImpl getInstance() {
        return INSTANCE;
    }

    public List<String> getSentences() {
        return sentences;
    }
    public int getSize(){ return sentences.size();}
    public void showElem(){
        if (sentences.isEmpty()){
        for (int i = 0; i < sentences.size(); i++) {
            System.out.println("Предложение №" +i + ":"+sentences.get(i));

        }
        }else {
            System.out.println("Предложений нет");
        }
    }
    public void deleteElem(){
        sentences.removeAll(sentences);
    }


}


