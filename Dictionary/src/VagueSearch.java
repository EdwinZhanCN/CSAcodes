
package Dictionary.src;

import java.util.ArrayList;

public class VagueSearch {
    public static void main(String[] args) {
        System.out.println(doAction("beajing", "beijing" ));
    }

    public static void vagueSearch(String str, String target, ArrayList<String> array){
        if (doAction(str, target) > 0.80 && array.size() < 6){
            array.add(target);
        }
    }
    public static double doAction(String query, String data) {
        int len1= query.length();
        int len2 = data.length();

        int[][]dif = new int[len1 +1][len2 + 1];

        for(int i = 0; i <= len1; i++){
            dif[i][0] = i;
        }

        for(int i = 0; i <= len2; i++){
            dif[0][i] = i;
        }

        int temp;
        for(int j = 1; j < len1; j++){
            for(int i = 1; i <= len2; i++){
                if(query.charAt(j -1) == data.charAt(i - 1)){
                    temp = 0;
                }else{
                    temp = 1;
                }
                dif[j][i] = min(dif[j-1][i-1] +temp, dif[j][i-1] + 1,dif[j-1][i] +1);
            }
        }
        double similarity;
        return similarity = 1 - (double)dif[len1][len2] / Math.max(query.length(),data.length());
    }

    private static int min(int... is){
        int min= Integer.MAX_VALUE;
        for(int i : is){
            if(min > i){
                min = i;
            }
        }
        return min;
    }
}
