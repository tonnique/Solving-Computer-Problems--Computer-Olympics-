/*
 * ��������� a+b
 * 
	�������� ������
		a � b  (1 + 5)
	��������� 
		a+b  (6)
*/ 
import java.util.Scanner;

public class APlusB {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String[] input = in.nextLine().split(" ");
 
				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);
				
				int c = a + b;
						
				System.out.println(c);		
					
		}	
}
