import java.util.ArrayList;
import java.util.Arrays;


public class Driver {
    public static void main(String[] args) {
        String[] str = new String[]{"cats", "dog", "sand", "and", "cat", ""};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(str));
        Trie trie = new Trie();
        trie.buildTree(words);
        System.out.println(trie.find("cat"));
        System.out.println(trie.find("sheldon"));
        trie.insert("sheldon");
        System.out.println(trie.find("sheldon"));
        System.out.println(trie.toString());
    }
}
