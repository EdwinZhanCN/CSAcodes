package Translator;

import java.util.*;

public class algorithm {
    public static String translate(String target,ArrayList<Word> list){
        String answer = "";
        String[] tag = target.split(" ");
        int len = tag.length;
        ArrayList<String> matches = new ArrayList<>();
        ArrayList<Word> phrases = new ArrayList<>();
        for (String s : tag) {
            for (Word word : list) {
                if (Objects.equals(s, word.getEnglish())) {
                    matches.add(word.getEnglish());
                }
            }
        }
        for (int j = 0; j < list.size(); j++) {
            if(target.contains(list.get(j).getEnglish())) {
                phrases.add(list.get(j));
            }
        }
        //
        int vrbCount = 0;
        int nonCount = 0;
        int adjCount = 0;
        int mw = 0;
        int pronCount = 0;
        int advCount = 0;
        //
        String[] translation = new String[tag.length];
        int p1 = 0;
        int p2 = 0;
        System.out.println(phrases);
        System.out.println(Arrays.toString(tag));
        try{
            while(p1 < tag.length && p2 < phrases.size()){
                if(phrases.get(p2).getEnglish().split(" ").length > 1){
                    translation[IndexOf(tag, phrases.get(p2).getEnglish().substring(0,1))] =
                            phrases.get(p2).getChinese();
                    p1+=phrases.get(p2).getEnglish().split(" ").length;
                }else if (phrases.get(p2).getEnglish().equals(tag[p1])) {
                    translation[IndexOf(tag, tag[p1])] = phrases.get(p2).getChinese();
                    p1++;
                    p2 = 0;
                    System.out.println(Arrays.toString(translation));
                }else {
                    p2++;
                }
            }
        }catch (IndexOutOfBoundsException e){
            for(int i = 0; i < translation.length; i++) {
                if (translation[i] != null) {
                    answer += translation[i];
                }
            }
            return "The answer is: " + answer;
        }
        for(int i = 0; i < translation.length; i++){
            if(translation[i] != null){
                answer+=translation[i];
            }
        }
        return "The answer is: " + answer;
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

    public static int IndexOf(String[] array, String target){
        for(int i = 0; i< array.length; i++){
            if(array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
