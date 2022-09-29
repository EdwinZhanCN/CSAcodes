package Translator;

public class Word {
    String english;
    String chinese;
    String partOfSpeech;

    String pinyin;

    public Word(String english, String chinese, String partOfSpeech){
        this.chinese = chinese;
        this.english = english;
        this.partOfSpeech = partOfSpeech;
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
