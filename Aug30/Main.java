import java.util.Arrays;
import java.util.Scanner;

/*
Hard

Uber

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = in.nextInt();
        }
        
        withDiv(arr);
        withoutDiv(arr);
    }

    public static void withDiv(int[] arr){
        int[] ans = new int[arr.length];
        int counter = arr[0];

        for(int i=1;i<arr.length - 1;i++)
            counter *= arr[i];

        ans[ans.length - 1] = counter;
        for(int i = arr.length-2;i>=0;i--){
            counter = counter/arr[i]*arr[i+1];
            ans[i] = counter;
        }

        System.out.print(Arrays.toString(ans));
    }

    public static void  withoutDiv(int[] arr){
        int[] ans = new int[arr.length];

        for(int i = 0;i<arr.length;i++)
            ans[i] = 1;

        //for ith index, store product of elements to left of i
        int temp = arr[0];

        for(int i = 1;i<arr.length;i++){
            ans[i] *= temp;
            temp *= arr[i];
        }


        //same way, store product to right of i
        temp = arr[arr.length-1];
        for(int i=arr.length - 2; i>=0 ;i--){
            ans[i] *= temp;
            temp *= arr[i];
        }
        System.out.print(Arrays.toString(ans));
    }
}