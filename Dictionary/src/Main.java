package Dictionary.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<Translation> translations = new ArrayList<>();
        fileReader.readFile(translations);
        algorithm.userInteraction(translations);
    }
}
