package Translator;

import java.util.*;

public class userInterface {
    public static void doAction(ArrayList<Word> array){
        Scanner sc = new Scanner(System.in);
        String answer = "y";
        String target;

        do {
            System.out.println("Please enter an english sentence that you want to translate ");
            target = sc.nextLine().toLowerCase();

            try{
                System.out.println(algorithm.translate(target, array));
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("Illegal character input!(Maybe it is not an English word....)");
                continue;
            }
        }while(answer.equalsIgnoreCase("y"));
    }
}
