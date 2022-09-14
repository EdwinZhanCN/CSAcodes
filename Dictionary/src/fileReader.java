package Dictionary.src;

import java.io.*;
import java.util.*;

public class fileReader {
    public static void readFile(ArrayList<Translation> array){

        try{
            BufferedReader br = new BufferedReader(new FileReader("English Chinese Translations.csv"));
            String line;

            int position = 0;

            while((line = br.readLine()) != null){
                String[] lineData = line.split(",");
                Translation T = new Translation(lineData[0].replace('"', ' ').replaceAll(" ", "").toLowerCase(), lineData[1]
                        .replace('"', ' ').replaceAll(" ", ""),position);
                array.add(T);
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
