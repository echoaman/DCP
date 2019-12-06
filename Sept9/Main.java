import java.util.Scanner;

/*

Hard

This problem was asked by Amazon.

There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

    1, 1, 1, 1
    2, 1, 1
    1, 2, 1
    1, 1, 2
    2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.

*/
public class Main{

	static int count = 0;

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter steps: ");
		int stairs = in.nextInt();

		System.out.print("Number of unique steps: ");
		int[] steps = new int[in.nextInt()];

		for(int i = 0;i<steps.length;i++){
			System.out.print("Type " + i + ": ");
			steps[i] = in.nextInt();
		}

		uniqueSteps(stairs,steps);
		System.out.println("Unique ways: " + count);
	}

	public static void uniqueSteps(int stairs, int[] steps){
		if(stairs == 0){
			count++;
			return;
		}

		for(int step : steps){
			if(stairs>=step)
				uniqueSteps(stairs - step, steps);
		}
	}
}

/*

The problem is  a fib seq problem, so dp reduces space complexity

store in dp[] the number of ways to reach ith stair

*/