import java.util.HashMap;
import java.util.Scanner;

/*
Easy

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

*/

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");

        int[] arr = new int[in.nextInt()];

        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = in.nextInt();
        }

        System.out.print("Enter k: ");
        int k = in.nextInt();

        in.close();

        System.out.println(getPairAns(arr,k));

        
    }

    public static String getPairAns(int[] arr, int k){
        HashMap <Integer,Integer> map = new HashMap<>();

        for (int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i]))
                return "True";
            
            map.put((k - arr[i]),1);
        }

        return "False";
    }
}