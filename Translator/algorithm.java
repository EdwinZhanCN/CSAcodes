package Translator;

import java.util.*;

public class algorithm {
    public static String translate(String target,ArrayList<Word> list){
        String[] tag = target.split(" ");
        String translation = "";
        String pinyin = "";
        int len = tag.length;
        ArrayList<Word> matches = new ArrayList<>();
        for(int i = 0; i<tag.length; i++){
            for (int j = 0; j < list.size(); j++) {

            }
        }

        return pinyin +
                "\n" + matches;
    }

   public static void onEvent(ArrayList<Word> possibles){
        ArrayList<Word> subjects = new ArrayList<>();
        ArrayList<Word> verbs = new ArrayList<>();
        ArrayList<Word> objects = new ArrayList<>();
        for(Word possible: possibles){
            if(possible.getPartOfSpeech().equals("n") || possible.getPartOfSpeech().equals("pron")){
                subjects.add(possible);
            }else if(possible.getPartOfSpeech().equals("v")){

            }
        }
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
