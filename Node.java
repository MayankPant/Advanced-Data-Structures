import java.util.Arrays;

public class Node {
    Node[] map;
    boolean isEnd;
    int letter;

    Node(int letter){
        map = new Node[27];
        Arrays.fill(map, null);
        isEnd = false;
        this.letter = letter;
    }
    Node(Node map[]){
        this.map = map;
        isEnd = false;
    }
    Node(){
        map = new Node[27];
        Arrays.fill(map, null);
        isEnd = false;

    }
}
