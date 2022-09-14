package Dictionary.src;

public class Translation {
    String english;
    String chinese;
    int objPosition;

    public Translation(String english, String chinese, int objPosition){
        this.english = english;
        this.chinese = chinese;
        this.objPosition = objPosition;
    }

    public int getObjPosition() {
        return objPosition;
    }

    public String getChinese() {
        return chinese;
    }

    public String getEnglish() {
        return english;
    }

    @Override
    public String toString(){
        return "English: " + english +
                "\nChinese: " + chinese +
                "\nPosition: " + objPosition;
    }

}
