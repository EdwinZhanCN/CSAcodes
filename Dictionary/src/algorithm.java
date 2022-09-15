package Dictionary.src;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class algorithm {
    public static void userInteraction(ArrayList<Translation> array) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String answer = "y";
        String target;
        do {
            System.out.println("Please enter an English word/phrase.");
            target = sc.nextLine().toLowerCase();
            try {
                Date date = new Date();
                System.out.println(searchWord(array, target));
                Date date1 = new Date();
                System.out.println("Time costs: " + (date1.getTime() - date.getTime()) + "ms");
                System.out.println();
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("Illegal character input!(Maybe it is not an English word....)");
                continue;
            }
            Thread.sleep(1000);
            System.out.println("Do you want to continue the searching?(type 'y' for agree or type anything else to exit.)");
            answer = sc.nextLine();
            if(answer.length() > 3){
                System.out.println("You seems like type a phrase, plz check again.(type 'y' for continue the searching)");
                answer = sc.nextLine();
            }
        }while(answer.equals("y"));
    }


    public static String searchWord(ArrayList<Translation> list, String target){
        int left = 0;
        int right = list.size()-1;
        int temp = 0;
        while(left <= right){
            int mid = left + (right - left)/2;

            if (list.get(mid).getEnglish().equals(target)) return "The definition is: " + "\n" + list.get(mid).getChinese();

            if ((int)list.get(mid).getEnglish().charAt(0) == (int)target.charAt(0)){
                temp = mid;
                break;
            }else if((int) list.get(mid).getEnglish().charAt(0) > (int) target.charAt(0)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        if (target.length() < 2){
            while(temp > 0) {
                temp--;
                if (list.get(temp).getEnglish().equals(target)) return "The definition is: " + "\n" +list.get(temp).getChinese();
            }
        }

        if ((int) list.get(temp).getEnglish().charAt(1) > (int) target.charAt(1)){
            while(temp > 0) {
                temp--;
                if (list.get(temp).getEnglish().equals(target)) return "The definition is: " + "\n" +list.get(temp).getChinese();
            }
        }else if((int) list.get(temp).getEnglish().charAt(1) < (int) target.charAt(1) && (int) list.get(temp).getEnglish().charAt(1) != 32){
            while(temp < list.size()-1) {
                temp++;
                if (list.get(temp).getEnglish().equals(target)) return "The definition is: " + "\n" +list.get(temp).getChinese();
            }
        }else{
            while(temp > 0) {
                temp--;
                if (list.get(temp).getEnglish().equals(target)) return "The definition is: " + "\n" +list.get(temp).getChinese();
            }
        }
        return "Word not found";
    }


    public static int getBlank(String str, int index) {
        if (index < str.length()) {
            if (str.charAt(index) == ' ') {
                return getBlank(str, index + 1) + 1;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public static String mergeBlank(String str){
        int num;
        String a;
        String b;
        for(int index = 0; index < str.length(); index++){
            num = getBlank(str, index);
            if(num >= 2){
                a = str.substring(0,index);
                b = str.substring(index + num -1);
                str = a+b;
            }
        }
        return str;
    }

    public static String trim(String str){
        if(str.charAt(0) == ' '){
            str = str.substring(1);
        }

        if (str.charAt(str.length() -1) == ' '){
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }





}
