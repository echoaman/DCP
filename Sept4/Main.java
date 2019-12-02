import java.util.HashMap;
import java.util.Scanner;

/*

Medium

This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

*/

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        HashMap<String,Character> map = new HashMap<>();
        Scanner in = new Scanner(System.in);

        for(int i =1;i<=26;i++){
            map.put(String.valueOf(i), (char)(96+i));
        }
        
        System.out.print("Enter string: ");
        String s = in.nextLine();

        //start decoding from right
        getCount(s,map,s.length()-1);
        System.out.println(count);
    }

    public static void getCount(String s, HashMap<String,Character> map, int index){
        if(index < 0){
            count++;
            return;
        }
        
        if(index == 0 && index != '0'){
            count++;
            return;
        }

        //taking 1 char
        if(s.charAt(index) != '0')
            getCount(s, map, index-1);

        //taking 2 chars
        String temp = Character.toString(s.charAt(index-1)) + Character.toString(s.charAt(index));
        if(map.containsKey(temp))
            getCount(s, map, index-2);
    }

}