

/*
��, ��� �� ��� ��������� � ����� ����� ���� ����� �����, ������� ����� 1 � N ������������.
�������� ������
� ������������ ������ ����������� ����� N, �� ������ �� ������������� 10000.
���������
�������� ����� ����� � ����� ������.

������
-- ���. ������ ---
-3

-- ��������� ---	
-5
----------------------
 */

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args){
		int sum=0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n <= 0) {
			for (int i = 1; i >= n; i--){
				sum += i; 
			}
		}
		else{
			for (int i = 1; i<=n; i++){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
