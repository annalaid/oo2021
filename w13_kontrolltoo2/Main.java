import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File loremIpsum = new File("loremipsum.txt");

        FileReader readFile = new FileReader(loremIpsum);
        BufferedReader readText = new BufferedReader(readFile);

        String[] lineDatas = null;
        String line = readText.readLine();
        List<String> formattedStrings = new ArrayList<>();
        List<String> lastLetters= new ArrayList<>();

        while (line != null){
            lineDatas = line.split(" ");
            line = readText.readLine();
        }

        readFile.close();
        readText.close();

        if(lineDatas!=null) {
            for (String string : lineDatas) {
                formattedStrings.add(string.replaceAll("[\\-+.^:,]", ""));
            }
        }
        System.out.println("Kõik sõnad: " + formattedStrings);

        Map<String, List<String>> letterWithCorrespondingWords = new HashMap<>();
        for (String string : formattedStrings) {
            String lastLetterOfString = string.substring(string.length() - 1);
            if( letterWithCorrespondingWords.containsKey( lastLetterOfString ) ) {
                addExistingMapEntryIfKeyFound( letterWithCorrespondingWords, string, lastLetterOfString );
            } else {
                addNewMapEntryIfNoKeyFound( letterWithCorrespondingWords, string, lastLetterOfString );
            }
            lastLetters.add(lastLetterOfString);
        }
        System.out.println("Kõik viimased tähed: " + lastLetters);
        System.out.println(letterWithCorrespondingWords);

        for(String keyValue : letterWithCorrespondingWords.keySet() ) {
            System.out.println("Kokku on " + keyValue + " tähe kohta " + letterWithCorrespondingWords.get(keyValue).size() + " sõna");
            
            File words = new File(keyValue + ".html");
            if (!words.exists()){
                words.createNewFile();
            }
            FileWriter fw = new FileWriter(words);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("<html><body>");
            for (String string : letterWithCorrespondingWords.get(keyValue)) {
                pw.println("<p>" + string + "</p>");
            }
            pw.println("</body></html>");
            pw.close();
        }
        createHTMLSourcePage(letterWithCorrespondingWords);
    }

    private static void createHTMLSourcePage(Map<String, List<String>> letterWithCorrespondingWords) throws IOException{
        File words = new File("source.html");
        if (!words.exists()){
            words.createNewFile();
        }
        FileWriter fw = new FileWriter(words);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("<html><body>");
        for (String string : letterWithCorrespondingWords.keySet()) {
            pw.println("<p><a href='" + string + ".html'>" + string.toUpperCase() + ": " + letterWithCorrespondingWords.get(string).size() + "</a></p>");
        }
        pw.println("</body></html>");
        pw.close();
    }

    private static void addExistingMapEntryIfKeyFound( Map<String, List<String>> letterWithCorrespondingWords, String string, String lastLetterOfString ){
        List<String> existingList = letterWithCorrespondingWords.get( lastLetterOfString );
        existingList.add( string );
        letterWithCorrespondingWords.put( lastLetterOfString, existingList );
    }

    private static void addNewMapEntryIfNoKeyFound( Map<String, List<String>> letterWithCorrespondingWords, String string, String lastLetterOfString ){
        List<String> newArray = new ArrayList<>();
        newArray.add( string );
        letterWithCorrespondingWords.put( lastLetterOfString, newArray );
    }
}
