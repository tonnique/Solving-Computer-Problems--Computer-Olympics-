/*
 * 	Now you will be given several pairs of values and you need to calculate sum for each pair.

		Input data will contain the total count of pairs to process in the first line.
		The following lines will contain pairs themselves - one pair at each line.
		Answer should contain the results separated by spaces.
	
		Example:

		data:
		3
		100 8
		15 245
		1945 54

		answer:
		108 260 1999

 */
package abbey;
import java.util.Scanner;

			
public class MoreSumLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int num = sc.nextInt();		
		
		long[] arr = new long[num];
		long a;
		long b;
		//long result = 0;
		
		for(int i=0; i < num; i++){
			a = sc.nextLong();
			b = sc.nextLong();

			arr[i] = a + b;
		}
		
		for(long elem : arr){
			System.out.print(elem + " ");
		}
						

	}

}
