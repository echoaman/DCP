import java.util.Arrays;
import java.util.Scanner;

public class Heap{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter elements: ");

        String[] arr = in.nextLine().trim().split(" ");
        int[] heap = new int[arr.length];

        for(int i = 0; i<arr.length; i++)
            heap[i] = Integer.parseInt(arr[i]);

        System.out.println(Arrays.toString(heap));

        /*
        for n sized heap, nodes from n/2 to n-1 satisfy the heap(max/min) property as leaf nodes. 
        Hence iterate from 0 to (n/2)-1 nodes as they are parent and might not satisfy heap  
        */

        for(int i = ((heap.length/2) -1);i>=0; i--)
            maxheapify(heap,i);

        System.out.println(Arrays.toString(heap));

    }

    public static void maxheapify(int[] heap, int parent){
        int lc = (parent*2) + 1;
        int rc = (parent*2) + 2;
        int largest;

        if(lc < heap.length && heap[lc] > heap[parent])
            largest = lc;
        else
            largest = parent;

        if(rc < heap.length && heap[rc] > heap[largest])
            largest = rc;

        if(largest != parent){
            int temp = heap[largest];
            heap[largest] = heap[parent];
            heap[parent] = temp;
            System.out.println(Arrays.toString(heap));
            maxheapify(heap, largest); 
        }
    }
}