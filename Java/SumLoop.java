/*
 * 	Now your goal is to learn programming loops - i.e. repeated actions. You are to find sum of several numbers (more than two). It will be useful to do this in loop. Perhaps "for" loop will suit nicely since the amount of values for summation is given.

		Input data has the following format:

    	first line contains N - amount of values to sum;
    	second line contains N values itself.

		Answer should contain a single value - the sum of N values.

		Example:

		data:
		8
		10 20 30 40 5 6 7 8

		answer:
		126

 */
package abbey;
import java.util.Scanner;

			
public class SumLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();		
		//int[] arr = new int[num];
		long result = 0;
		
		for(int i=0; i < num; i++){
			result += in.nextInt();
		}
		
		System.out.println(result);				

	}

}
