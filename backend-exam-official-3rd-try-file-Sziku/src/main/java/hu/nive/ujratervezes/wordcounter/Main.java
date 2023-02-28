package hu.nive.ujratervezes.wordcounter;

public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.countWords("src/main/resources/test3.txt", 4 );
    }

}
