package Dictionary.src;

import java.util.ArrayList;

public class VagueSearch {
    public static void main(String[] args) {
        System.out.println(doAction("beiijing", "beijing" ));
    }

    public static void vagueSearch(String str, String target, ArrayList<String> array){
        if (doAction(str, target) > 0.80 && array.size() < 6){
            array.add(target);
        }
    }
    public static double doAction(String query, String data){
        int allows = 0;
        int count = 0;
        int p1 = 0;
        int p2 = 0;
        char[] searchArrays = query.toCharArray();
        char[] dataArrays = data.toCharArray();

        while (true){

        }

    }
}
