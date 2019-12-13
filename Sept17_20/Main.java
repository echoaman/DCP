import java.util.LinkedList;
import java.util.Scanner;

/*

Easy

This problem was asked by Google.

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

*/
public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		Node head1 = null;
		Node head2 = null;
		Node trav = null;

		for(String s : in.nextLine().trim().split(" ")){
			if(head1 == null){
				head1 = new Node(Integer.parseInt(s));
				trav = head1;
			}else{
				trav.next = new Node(Integer.parseInt(s));
				trav = trav.next;
			}
		}

		for(String s : in.nextLine().trim().split(" ")){
			if(head2 == null){
				head2 = new Node(Integer.parseInt(s));
				trav = head2;
			}else{
				trav.next = new Node(Integer.parseInt(s));
				trav = trav.next;
			}
		}

		System.out.println(getAns(head1,head2));
	}

	public static int getAns(Node head1, Node head2){
		int len1 = getLength(head1);
		int len2 = getLength(head2);

		if(len1 > len2)
			return getValue(head1, head2, len1 - len2);
		else
			return getValue(head2, head1, len2 - len1);
	}

	public static int getLength(Node head){
		int len = 0;
		Node trav = head;
		while(trav != null){
			len++;
			trav = trav.next;
		}

		return len;
	}

	public static int getValue(Node large, Node small, int diff){
		Node largeTrav = large;
		for(int i = 0; i<diff; i++)
			largeTrav = largeTrav.next;
		
		Node smallTrav = small;

		while(largeTrav.value != smallTrav.value){
			largeTrav = largeTrav.next;
			smallTrav = smallTrav.next;
		}

		return largeTrav.value;
	}
}

class Node{
	int value;
	Node next;

	public Node(int value){
		this.value = value;
		this.next = null;
	}
}