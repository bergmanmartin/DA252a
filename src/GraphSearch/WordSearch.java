package GraphSearch;

import java.io.*;
import java.util.ArrayList;

public class WordSearch {







    public void wordreader() throws IOException {
        BufferedReader r =
                new BufferedReader(new InputStreamReader(new FileInputStream("files/fnam.txt")));
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            String word = r.readLine();
            if (word == null) {
                break;
            }
            assert word.length() == 5;  // indatakoll, om man kör med assertions på
            words.add(word);
        }
        System.out.println(words);
    }

    public static void main(String[] args) throws IOException {
        WordSearch wordSearch = new WordSearch();
        wordSearch.wordreader();

    }
}
