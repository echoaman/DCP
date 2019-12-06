import java.util.HashMap;
import java.util.Scanner;

/*

Hard

This problem was asked by Amazon.

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

*/
public class Main{

	static String ans = "";
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter k: ");
		int k = in.nextInt();
		in.nextLine();

		System.out.print("Enter string: ");
		String s = in.next();

		getSubstring(s,k);
	}

	public static void getSubstring(String s, int k){
		HashMap<Character, Boolean> map = new HashMap<>();

		for(int i = 0;i<s.length() - k + 1;i++){
			for(int j = i;j<s.length();j++){
				
			}
		}
	}
}