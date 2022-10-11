package Translator;

import java.util.*;

public class algorithm {
    public static String translate(String target,ArrayList<Word> list){
        String[] tag = target.split(" ");
        ArrayList<String> translation = new ArrayList<>();
        String pinyin = "";
        int len = tag.length;
        ArrayList<Word> matches = new ArrayList<>();

        for (int j = 0; j < list.size(); j++) {
            if(target.contains(list.get(j).getEnglish())) {
                matches.add(list.get(j));
            }
        }
        System.out.println(matches);
        int pronCount = 0;
        int vrbCount = 0;
        int nonCount = 0;
        String mw;
        if(matches.size() > 1){
            for(Word str: matches){
                if(str.getPartOfSpeech().equalsIgnoreCase("pron")){
                    translation.add(0,str.getChinese());
                    pronCount++;
                }else if(str.getPartOfSpeech().equalsIgnoreCase("v")){
                    if(vrbCount < 1){translation.add(1,str.getChinese());}
                    vrbCount++;
                }else if(str.getPartOfSpeech().equalsIgnoreCase("n")){
                    if(nonCount < 1){translation.add(str.getChinese());}
                    nonCount++;
                }
            }
        }

        String str =  delRepeat(String.join("",translation));
        return pinyin +
                "\n" + str;
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
