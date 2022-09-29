package Translator;

import java.util.ArrayList;

public class Translator {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<>();
        fileReader.readFile(words,"HSK Words.csv");
        userInterface.doAction(words);
    }
}
