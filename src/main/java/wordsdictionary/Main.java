package wordsdictionary;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        WordDictionary obj = new WordDictionary();
        obj.addWord("WordDictionary");
        obj.addWord("addWord");
        obj.addWord("addWord");
        obj.addWord("addWord");
        obj.addWord("search");
        obj.addWord("search");
        obj.addWord("search");

        List.of("","bad","dad","mad","pad","ad.",".dd","w..", "....").forEach(word -> {
            System.out.println(word+": "+obj.search(word));
        });

        System.out.println(obj);
*/
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad")); // return False
        System.out.println(wordDictionary.search("bad")); // return True
        System.out.println(wordDictionary.search(".ad")); // return True
        System.out.println(wordDictionary.search("b..")); // return True
        System.out.println(wordDictionary.search("....")); // return false

        System.out.println(wordDictionary);
        
    }


}
