package Translator;

import java.util.*;

public class userInterface {
    public static void doAction(ArrayList<Word> array){
        Scanner sc = new Scanner(System.in);
        String answer = "y";
        String target;

        do {
            System.out.println("Please enter an english sentence that you want to translate ");
            target = sc.nextLine();
            try{
                System.out.println(algorithm.translate(target, array));
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("Illegal character input!(Maybe it is not an English word....)");
                continue;
            }

            //continue?//
            System.out.println("Do you want to continue the searching?(type 'y' for agree or type anything else to exit.)");
            answer = sc.nextLine();
            if(answer.length() > 3){
                System.out.println();
                System.out.println("You seems like type a phrase, plz check again.(type 'y' for continue the searching)");
                answer = sc.nextLine();
            }
        }while(answer.equalsIgnoreCase("y"));
    }
}
