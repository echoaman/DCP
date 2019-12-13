import java.util.Scanner;

/*

Easy

This problem was asked by Snapchat.

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

*/
public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Number of lectures: ");
		Lecture[] arr = new Lecture[in.nextInt()];
		in.next();

		for(int i = 0; i<arr.length; i++){
			String[] input = in.nextLine().trim().split(" ");
			arr[i] = new Lecture(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
		}

		for(int i =0 ; i<arr.length; i++)
			System.out.println(arr[i].start + " " + arr[i].end);
	}
}


class Lecture{
	int start;
	int end;

	public Lecture(int start, int end){
		this.start = start;
		this.end = end;
	}

	public static void sort(Lecture[] arr){
		System.out.println("Hellu");
	}
}