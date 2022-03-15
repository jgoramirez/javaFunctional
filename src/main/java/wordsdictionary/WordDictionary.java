package wordsdictionary;

import java.util.ArrayList;
import java.util.List;

public class WordDictionary {

    private List<String> words;

    public WordDictionary() {
        words = new ArrayList<String>();
    }

    public void addWord(String word) {
        if (!words.contains(word.toLowerCase()) && word.length() >= 1 && word.length() <= 25)
            words.add(word.toLowerCase());
    }

    public boolean search(String word) {
        return words.stream().anyMatch(
                wordSearch -> {
                    if (word.chars().filter(ch -> ch == '.').count() > 3) return false;
                    return wordSearch.matches(word.toLowerCase());
                }
        );
    }

    @Override
    public String toString() {
        return "WordDictionary{" +
                "words=" + words +
                '}';
    }
}
