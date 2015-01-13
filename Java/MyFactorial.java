/*
*  ����������� 1.  n!!...! = n(n-k)(n-2k)...(n mod k), ���� n �� ������� �� k; 
*  						   n!!...! = n(n-k)(n-2k)...k, ���� n ������� �� k 
*  	         				(������ ! � ����� ������� k ����).
*	����������� 2. X mod Y � ������� �� ������� X �� Y.
*	
*	��������, 10 mod 3 = 1; 3! = 3*2*1; 10!!! = 10*7*4*1.
*	
*	�� �� �������� n � k ������ ��������� �������� ��������� �� ����������� 1. � ��� �����?
*
*	�������� ������
*
*	� ������������ ������ ������� ���� ����� ����� n, 1 <= n <= 10, ����� ����� ���� ������, ����� k ��������������� ������,
*	 1 <= k <= 20.
*	 
*	���������
*	�������� ���� ����� - n!!...!
*
*	������
*	�������� ������			���������
*	9 !!								945
*
*/
import java.util.*;

public class MyFactorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		String tmpStr = in.next();
		int len = tmpStr.length();
		int ostatok = num%len;
		int result = num;
		
		if (ostatok == 0) {ostatok=len;}
		
		for(int i = 1; (num - i* len) >= ostatok; i++){
			result = result * (num - i * len);
		}

		System.out.println(result);
	}

}
