package Translator;

public class Word {
    String english;
    String chinese;
    String pinyin;
    String partOfSpeech;

    public Word(String english, String chinese, String piniyn, String partOfSpeech){
        this.chinese =chinese;
        this.english = english;
        this.pinyin = piniyn;
        this.partOfSpeech = partOfSpeech;
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

    public String getPinyin() {
        return pinyin;
    }

    @Override
    public String toString(){
        return chinese + ": " +
                english;
    }
}

