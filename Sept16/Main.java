import java.util.Arrays;
import java.util.Scanner;

/*

Medium

This problem was asked by Facebook.

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.

*/
public class Main{

	static int total = 0;
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);

		int[][] cost = new int[n][k];

		// in.nextLine();
		for(int i = 0; i<n; i++){
			input = in.nextLine().split(" ");
			for(int j = 0; j<k; j++)
				cost[i][j] = Integer.parseInt(input[j]);
		}

		for(int i = 0; i<n; i++){
			int[] heap = cost[i];
			for(int x = (k/2)-1; x>=0; x--)
				minheapify(heap,x);
			total += heap[0];
		}


		System.out.println("Min cost = " + total);
	}

	public static void minheapify(int[] heap, int parent){
		int lc = parent*2 + 1;
		int rc = parent*2 + 2;
		int least;

		if(lc < heap.length && heap[lc] < heap[parent])
			least = lc;
		else
			least = parent;

		if(rc < heap.length && heap[rc] < heap[least])
			rc = least;

		if(least != parent){
			int temp = heap[least];
			heap[least] = heap[parent];
			heap[parent] = temp;
			minheapify(heap, least);
		}
	}
}