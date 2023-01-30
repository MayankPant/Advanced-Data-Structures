import java.util.Arrays;
import java.util.List;

public class Trie {

    Node root;
    Trie(){
        root = new Node();
    }

    public boolean buildTree(List<String> words){
        if(words.size() == 0)
            return false;

        Node iterator;
        for (String word : words){
            iterator = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if(iterator.map[ch - 'a'] == null) {
                    iterator.map[ch - 'a'] = new Node();

                    iterator.letter = ch - 'a';
                }
                iterator = iterator.map[ch - 'a'];
            }
            iterator.isEnd = true;
        }
        return true;
    }
    public boolean find(String word){
        Node iterator = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(iterator.map[ch - 'a'] != null)
                iterator = iterator.map[ch - 'a'];
            else
                return false;
        }
        return iterator.isEnd;
    }
    public void insert(String word){

        Node iterator = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(iterator.map[ch - 'a'] == null) {
                iterator.map[ch - 'a'] = new Node();
                iterator.letter = ch - 'a';
            }
            iterator = iterator.map[ch - 'a'];
        }
        iterator.isEnd = true;
    }
    public String toString(){
        StringBuilder str = new StringBuilder("");
        str.append("{ ");
        System.out.println(Arrays.toString(root.map));
        for (int i = 0; i < root.map.length; i++){
            Node node = root.map[i];

            if(node == null)
                continue;

            StringBuilder word = new StringBuilder("");
            Node iterator = node;
            while (!iterator.isEnd){
                word.append((char)(iterator.letter + 'a'));
                iterator = iterator.map[iterator.letter];
            }
            str.append(word);
            str.append(',');
        }

        str.deleteCharAt(str.length() - 1);
        str.append(" }");

        return str.toString();
    }
}
