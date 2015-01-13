/*
 * ����������� ������� � ������� ��������� ������������ ����� ������������� n *m  ������ .
 *  �� ������ ���������� ������ ������, ���� ������� ������� � ��������� ������� ����������� 
 *  ���������� �������. ������ ����� ����� ������ a *a.

����� ���������� ���������� ���� ����������� ��� ��������� �������? ��������� ������� �������
 ������� �����������, ��� ����������� �������, �� ��� ������ ���� ������� �����������. ��������� 
 ����� ������ ������ ��� �������, � ��������� ������������ ������ �������. ������� ���� ������ ���� 
 ����������� �������� �������.
 
������� ������

� ������ ������ �������� ��� ����� ����������� ����� n, m � a (1 <= n, m, a <= 109).
�������� ������

�������� ������� ���������� ����.

������� ������

������� ������
6 6 4

�������� ������
4

 */
import java.text.*;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

public class TheatreSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
					
		
			double a = Double.parseDouble(input[0]); 
			double b = Double.parseDouble(input[1]);
			double c = Double.parseDouble(input[2]);
			
			double tiles = Math.ceil(a / c)*Math.ceil(b / c);
					
			NumberFormat formatter = NumberFormat.getNumberInstance();
			formatter.setGroupingUsed(false);
			formatter.setMaximumFractionDigits(0);
			String s = formatter.format(tiles);
			System.out.println(s);
		
		}		
	}

