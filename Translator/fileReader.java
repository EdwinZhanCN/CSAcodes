package Translator;

import Dictionary.src.Translation;

import java.io.*;
import java.util.*;

public class fileReader {
    public static void readFile(ArrayList<Translation> array, String fileName){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            int position = 0;

            while((line = br.readLine()) != null){
                String[] lineData = line.split(",");
                String English = lineData[3].replace("\"","");
                String Chinese = lineData[1] .replace("\"", "");
                String partOfSpeech = lineData[0].replace("\"","");
                String pinyin = lineData[2].replace()
                Word W = new Word()
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
}
