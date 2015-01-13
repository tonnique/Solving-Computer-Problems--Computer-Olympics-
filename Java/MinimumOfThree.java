/*
 * 	Of two numbers, please, select one with minimum value. Here are several pairs of numbers for thorough testing.

		Input data will contain number of test-cases in the first line.
		Following lines will contain a pair of numbers to compare each.
		
		For Answer please enter the same amount of minimums separated by space, for example:

		data:
		3
		5 3
		2 8
		100 15

		answer:
		3 2 15
 */
package abbey;

import java.util.Scanner;

public class MinimumOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int num = sc.nextInt();		
		
		long[] arr = new long[num];
		long a;
		long b;
		
		for(int i=0; i < num; i++){
			a = sc.nextLong();
			b = sc.nextLong();

			arr[i] = min(a, b);
		}
		
		for(long elem : arr){
			System.out.print(elem + " ");
		}
	}
	
	public static long min(long a, long b){
		if (a > b) return b;
		else return a;
	}

}
