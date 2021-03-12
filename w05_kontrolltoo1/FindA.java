import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FindA {

    public static WordInfo findAllAs() throws IOException {
        File file = new File("text.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String[] lineDatas = null;
        String line = br.readLine();

        while (line != null){
            lineDatas = line.split(" ");
            line = br.readLine();
        }
        
        fr.close();
        br.close();
        
        int aCount = 0;
        int letterCount = 0;
        HashMap<String, Integer> wordWithACount = new HashMap<String, Integer>();
        ArrayList<Integer> aCountOne = new ArrayList<>();
        ArrayList<Integer> aCountTwo = new ArrayList<>();
        ArrayList<Integer> aCountThree = new ArrayList<>();
        ArrayList<Integer> aCountFour = new ArrayList<>();

        
        for (String word : lineDatas) {
            int aCountInWord = 0;
            letterCount = letterCount + word.length();
            for(int i = 0; i < word.length(); i++){
                if(word.toUpperCase().charAt(i) == "A".charAt(0)){
                    aCount++;
                    aCountInWord++;
                }
            }
            wordWithACount.put(word, aCountInWord);

            if(aCountInWord == 1){
                aCountOne.add(aCountInWord);
            }

            if(aCountInWord == 2){
                aCountTwo.add(aCountInWord);
            }

            if(aCountInWord == 3){
                aCountThree.add(aCountInWord);
            }

            if(aCountInWord == 4){
                aCountFour.add(aCountInWord);
            }
        }
        
        
        return new WordInfo(lineDatas.length, lineDatas, aCount, letterCount, wordWithACount, aCountOne, aCountTwo, aCountThree, aCountFour);
    }


}