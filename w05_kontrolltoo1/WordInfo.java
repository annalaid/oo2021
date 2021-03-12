import java.util.HashMap;
import java.util.ArrayList;

public class WordInfo {
    private int wordCount;
    private String[] allWords;
    private int aCount;
    private int letterCount;
    private HashMap<String, Integer> wordWithACount;
    private ArrayList<Integer> aCountOne;
    private ArrayList<Integer> aCountTwo;
    private ArrayList<Integer> aCountThree;
    private ArrayList<Integer> aCountFour;
	
    public WordInfo(int count, String[] allWords, int aCount, int letterCount, HashMap<String, Integer> wordWithACount, ArrayList<Integer> aCountOne, ArrayList<Integer> aCountTwo, ArrayList<Integer> aCountThree, ArrayList<Integer> aCountFour){
        this.wordCount = count;
        this.allWords = allWords;
        this.aCount = aCount;
        this.letterCount = letterCount;
        this.wordWithACount = wordWithACount;
        this.aCountOne = aCountOne;
        this.aCountTwo = aCountTwo;
        this.aCountThree = aCountThree;
        this.aCountFour = aCountFour;
    }
    
    

	public int getWordCount() {
        return wordCount;
	}

    public String[] getAllWords() {
        return allWords;
    }

    public int getACount() {
        return aCount;
    }

    public int getLetterCount() {
        return letterCount;
    }

    public HashMap<String, Integer> getWordWithACount() {
        return wordWithACount;
    }

    public ArrayList<Integer> getACountOne() {
        return aCountOne;
    }

    public ArrayList<Integer> getACountTwo() {
        return aCountTwo;
    }

    public ArrayList<Integer> getACountThree() {
        return aCountThree;
    }

    public ArrayList<Integer> getACountFour() {
        return aCountFour;
    }
}
