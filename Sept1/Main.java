import java.util.Arrays;
import java.util.Scanner;

/*

hard

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int[] arr = new int[in.nextInt()];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = in.nextInt();
        }

        int poslen = segregate(arr) + 1;
        // System.out.println(Arrays.toString(arr));

        findMissingPositive(arr, poslen);
    }


    //divide into sets - positive(to left) and neg + zeros(to right)
    public static int segregate(int[] arr){
        int x = arr.length - 1;
        for(int i = arr.length - 1;i>=0;i--){
            if(arr[i] <= 0){
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
                x--;
            }
        }

        return x;
   
    }


    public static void findMissingPositive(int[] arr, int poslen){
        if(poslen == 0){
            System.out.println(1);
            return;
        }
        for(int i = 0; i<poslen;i++){
            if(Math.abs(arr[i]) <= poslen){

                //invert sign of arr[abs(arr[i]) - 1]
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }
        }

        //if ith element is +, print i + 1
        for(int i = 0;i<poslen;i++){
            if(arr[i] > 0){
                System.out.println(i+1);
                return;
            }
        }

        //if none of the elements are +
        System.out.println(poslen + 1);
    }
}