package IndependantLibisev;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Average {

    public static int getAverage(int nr1, int nr2, int nr3) {
        int sum = nr1 + nr2 + nr3;
        int average = sum / 3;
        return average;
    }

    public static List<Integer> getLibisev() throws IOException {
        File file = new File("IndependantLibisev/libisev.txt");
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        List<Integer> inputNumbers = new ArrayList<>();
        String line = br.readLine();
        while (line != null){
            inputNumbers.add(Integer.parseInt(line));
            line = br.readLine();
        }
        
        fr.close();
        br.close();

        return calculateMovingAverages(inputNumbers);
    }

    private static List<Integer> calculateMovingAverages(List<Integer> inputNumbers) {
        
        List<Integer> movingAverages = new ArrayList<>();
        int avaragesSize = inputNumbers.size();
        
        for(int x = 0; x < avaragesSize; x++){
            if(x < avaragesSize - 2){
                movingAverages.add(getAverage(inputNumbers.get(x), inputNumbers.get(x+1), inputNumbers.get(x+2)));
            }
        }
        
        return movingAverages;
    }

    public static void moveIntoFile(List<Integer> input) throws IOException {
        File filewrite = new File("IndependantLibisev/out_libisev.txt");

        if (!filewrite.exists()) {
            filewrite.createNewFile();
        }

        PrintWriter pw = new PrintWriter(filewrite);
        for (Integer integer : input) {
            pw.println(integer);
        }
        pw.close();
    }

}
