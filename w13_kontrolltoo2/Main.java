import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        File loremIpsum = new File("loremipsum.txt");

        FileReader readFile = new FileReader(loremIpsum);
        BufferedReader readText = new BufferedReader(readFile);

        String[] lineDatas = null;
        String line = readText.readLine();
        List<String> formattedStrings = new ArrayList<>();

        while (line != null){
            lineDatas = line.split(" ");
            line = readText.readLine();
        }
        if(lineDatas!=null) {
            for (String string : lineDatas) {
                formattedStrings.add(string.replace("!.,", ""));
            }
            System.out.println(formattedStrings);
        }

        readFile.close();
        readText.close();
    }
}