package hu.nive.ujratervezes.wordcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCounter {
    public int[] countWords(String fileName, int wordLength) {

        List<Integer> wordCountAllRow = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String st;
            while ((st = br.readLine()) != null) {
                String[] wordsinRow = st.replaceAll("\\.", "").replaceAll("!", "").replaceAll("\\?", "").split("\\s+");
                int wordsRowCount = 0;
                for (String word : wordsinRow){
                    if (word.length() == wordLength){
                        wordsRowCount++;
                    }
                }
                wordCountAllRow.add(wordsRowCount);
            }
            br.close();
            return wordCountAllRow.stream().mapToInt(i->i).toArray();
        } catch (IOException e) {
            return new int[0];
        }
    }
}
