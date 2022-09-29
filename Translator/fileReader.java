package Translator;

import Dictionary.src.Translation;

import java.io.*;
import java.util.*;

public class fileReader {
    public static void readFile(ArrayList<Word> array, String fileName){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            int position = 0;

            while((line = br.readLine()) != null){
                String[] lineData = line.split(",");

                String English = lineData[3].replace("\"","");
                English = findParentheses(English,'(',')').toLowerCase();

                String Chinese = lineData[1] .replace("\"", "");
                Chinese = findParentheses(Chinese,'(',')').toLowerCase();

                String partOfSpeech = lineData[0].replace("\"","");
                partOfSpeech = findParentheses(partOfSpeech,'(',')').toLowerCase();

                String pinyin = lineData[2].replace("\"","");
                pinyin = findParentheses(pinyin,'(',')').toLowerCase();

                Word W = new Word(English,Chinese,partOfSpeech,pinyin);
                array.add(W);
                position++;
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }catch (IOException e){
            System.out.println("ERR");
            System.exit(0);
        }
    }

    public static String findParentheses (String str,char left, char right){
        int i = str.indexOf(left);
        int j = i;

        if (i == -1) return str;

        while(i != -1){
            i++;
            if(str.charAt(i) == right){
                String temp = str.substring(j,i+1);
                str = str.replace(temp, "");
                i = str.indexOf(left);
            }
        }
        return str;
    }

}
