package Translator;

import java.util.*;

public class algorithm {
    public static String translate(String target,ArrayList<Word> list){
        String[] tag = target.split(" ");
        String translation = "";
        String pinyin = "";
        int len = tag.length;
        ArrayList<Word> matches = new ArrayList<>();
        ArrayList<Word> phrases = new ArrayList<>();

        for (String s : tag) {
            for (Word word : list) {
                if (Objects.equals(s, word.getEnglish())) {
                    matches.add(word);
                }
            }
        }


        for (int j = 0; j < list.size(); j++) {
            if(target.contains(list.get(j).getEnglish())) {
                phrases.add(list.get(j));
            }
        }


        for(Word match: matches){
            int vrbCount = 0;
            int nonCount = 0;
            int adjCount = 0;
            int mw = 0;
            int pronCount = 0;
            int advCount = 0;
            translation += match.getChinese();
        }

        System.out.println(phrases);
        System.out.println(matches);


        return pinyin +
                "\n" + translation;
    }


    public static String delRepeat(String str){
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < str.length(); i++){
            if(!set.add(str.substring(i, i+1))){
                return str.substring(0,i) + str.substring(i+1);
            }
        }
        return str;
    }
}
