import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        WordInfo info = FindA.findAllAs();
        int wordsWithOneA = info.getACountOne().size();
        int wordsWithTwoA = info.getACountTwo().size();
        int wordsWithThreeA = info.getACountThree().size();
        int wordsWithFourA = info.getACountFour().size();
        HashMap<String, Integer> allWordsWithA = info.getWordWithACount();
        System.out.println("Tekstifailis on kokku " + info.getWordCount() + " sõna.");
        System.out.println("Tekstifailist leiti " + info.getACount() + " A tähte.");

        System.out.println("Sõnades on A tähti järgmiselt:");
        for (String key : allWordsWithA.keySet()) {
            System.out.println(key + " = " + allWordsWithA.get(key));
        }
        System.out.println("Sõnades oli keskmiselt " + info.getWordCount() / info.getACount() + " A tähte.");
        System.out.println("Suhtarvuna tähtede üldarvu oli A tähti: " + info.getLetterCount() / info.getACount());

        System.out.printf("\n %10s %5s", "A tähti sõnas: ", " Sõnade arv kokku:");
        System.out.println("\n ----------------------------------");
        System.out.format("%11s %5s %6s", " 1 ", "|", wordsWithOneA);
        System.out.format("\n %10s %5s %6s", " 2 ", "|", wordsWithTwoA);
        System.out.format("\n %10s %5s %6s", " 3 ", "|", wordsWithThreeA);
        System.out.format("\n %10s %5s %6s", " 4 ", "|", wordsWithFourA);
        System.out.println("\n ----------------------------------");
    }

}
