import java.io.File;
import java.util.*;


public class Dictionary {
    public static void main(String[] args) throws Exception{
        File file = new File("word.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
