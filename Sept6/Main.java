import java.util.Scanner;

/*

Hard

This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?

*/

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int[] arr = new int[in.nextInt()];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = in.nextInt();
        }

        if(arr.length == 1){
            System.out.println(arr[0]);
            return;
        }

        if(arr.length == 2){
            System.out.println(arr[0] > arr[1] ? arr[0] : arr[1]);
            return;
        }

        System.out.println(getSum(arr));
    }

    public static int getSum(int[] arr){
        int first = arr[arr.length-1] > arr[arr.length - 2] ? arr[arr.length-1] : arr[arr.length - 2];
        int second = arr[arr.length-1] > arr[arr.length - 2] ? arr[arr.length-2] : arr[arr.length - 1];
        int index = arr.length - 3;

        while(index != 0){
            
        }
    }
}