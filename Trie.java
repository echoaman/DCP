import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Trie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of strings: ");
        String[] str = new String[in.nextInt()];
        in.nextLine();

        for(int i=0;i<str.length;i++){
            System.out.print("Enter string " + i + ": ");
            str[i] = in.nextLine();
        }

        // System.out.println(Arrays.toString(str));    
    }
}

class Node{
    HashMap<Character,Boolean> charset;
    boolean present;
    HashMap<Node,Boolean> next;

    public Node(char c){
        this.charset = new HashMap<>();
        this.present = false;
        this.next = null;

        charset.put(c, true);
    }
}