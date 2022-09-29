package Translator;

import java.util.ArrayList;

public class algorithm {
    public static String translate(String target,ArrayList<Word> list){
        String[] data = target.split(" ");
        String translation = "";
        String pinyin = "";
        for (String Data : data) {
            for (Word word : list) {
                if (Data.equals(word.getEnglish())) {
                    translation += word.getChinese();
                    pinyin +=  word.getPinyin()+ " ";
                }
            }
        }
        return pinyin +
                "\n" + translation;
    }
}
