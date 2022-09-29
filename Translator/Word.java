package Translator;

public class Word {
    String english;
    String chinese;
    String partOfSpeech;

    String pinyin;

    public Word(String english, String chinese, String partOfSpeech,String pinyin){
        this.chinese = chinese;
        this.english = english;
        this.partOfSpeech = partOfSpeech;
        this.pinyin = pinyin;
    }


    public String getPinyin(){
        return pinyin;
    }

    public String getChinese() {
        return chinese;
    }

    public String getEnglish() {
        return english;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }
}
