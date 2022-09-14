package Dictionary.src;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class algorithm {
    public static void userInteraction(ArrayList<Translation> array) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String answer = "y";
        String target = "";
        do {
            System.out.println("Please enter an english word/phrase.");
            target = sc.nextLine().toLowerCase();
            if((int)target.charAt(0) < 32){
                System.out.println("Don't enter a space in front of the phrase!");
                continue;
            }
            Date date = new Date();
            System.out.println(searchWord(array, target));
            Date date1 = new Date();
            System.out.println("Time costs: " + (date1.getTime() - date.getTime()) + "ms");
            System.out.println();
            Thread.sleep(1000);
            System.out.println("Do you want to continue the searching?(type 'y' for agree or type anything else to exit.)");
            answer = sc.nextLine();
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
}
