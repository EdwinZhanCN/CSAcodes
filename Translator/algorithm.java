package Translator;

import java.util.ArrayList;

public class algorithm {
    public static String translate(String target,ArrayList<Word> list){
        String[] tag = target.split(" ");
        String translation = "";
        String pinyin = "";
        int len = tag.length;
        ArrayList<String> matches = new ArrayList<>();
        for(int i = 0; i<tag.length; i++){
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getEnglish().contains(tag[i])) {
                    matches.add(list.get(j).getChinese());
                }
            }
        }
        for(String str: matches){
            translation += str + " ";
        }

        return pinyin +
                "\n" + matches;
    }

}
