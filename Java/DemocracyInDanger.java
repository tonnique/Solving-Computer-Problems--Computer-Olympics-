/*
 * ����������
� ����� �� ��������� ���������� ���������� �������� ��� ������� ����������� ����������� ������� 
������������ ������� �� ����� �������� �������, �������, � �������, ���� �� ����� �����. ���� �� 
������� ������, �������� ������ � ������ ��� ����� ����� �������� �����, ������ �������� ��������� 
������� ������������� �������. ������� ���������� ���� ��, ��� ��������� ������� � ��������� ����� 
����������� ��������, � ���������� ����� �������� ��������� ���� ������ �������.
���� ������� �������� � ���������: � ������� �������� �� � �������� ��� ���������� ������� �������� 
�� K ����� (������������� ������ �� �����������). ����������� �� ������ ������� ������ ��������� 
��������� �������� � ������ ������, ������ ���������, ��� ������ ������������� ���, ���� ��� 
�������� ����� �������� ����� � ���� ������, � � ��������� ������ ���������, ��� ������ ������������� 
�������. ����� ���������� ����������� � ������� �������������� ���������� �����, ������������� 
��� � �������, � ������ ������� ������������ � ��� � ������ ��� ������, ����� �����, ������������� 
���, ����������� ����� �������� ������ ���������� �����.
��� ������� ������� ���� � �������� ������� �������� �������. ����� ������ �������� ����������, 
�������� �����, ������, ��������� ���������� ����� �������. ���������, ��� ���������� ������, 
������������ �������, ������ ������� ��������� ������� �� ������������ ����� �����������. 
��������� �����, ��� �������� ����������� ��������� ��������� �������, �� ������� ��� ���� 
�������� ������������ �������!
�����, ��������, �� ������� ���� ������������ ��� ������ �����������, ������������ � 5, 5 � 7 
������� ��������������. ����� ������ ���������� ����� ���� ����������� � ������ �� ������ ���� �����,
 � ��� ������ �������� ������� ����� ������ �������� ���, ������ ������, ����������� ��� ����� 
 �����������.

������
��� ���� �������� ���������, ������� ���������� �� ��������� ��������� ����������� �� ������ 
����������� ���������� ����������� ������, �����������, ��� ��������� ������������� �� �� �������, 
��� �������� ������ �������.

�������� ������
� ������ ������ �������� �������� ����� K � ���������� ����� ����������� (1 <= K <= 1011). �� ������ 
������ ����� ������ �������� K �������� �����, ������� ������ ���������� ����������� � �������. 
��������� ������� �� ����������� 9999 �������.

���������
�������� ����������� ���������� ����������� ������, ��������� ������ ����� �����������.

������

�������� ������	
--���. ������ ----
3
5 7 5
--- ��������� ------
6
----------------------

 */
import java.util.*;

public class DemocracyInDanger {
	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();

		// ����� ������� ��� ������
		int sum = 0;
		
		 try{
		      	while (in.hasNext()) {
		       		l.add(in.nextInt());
		       	}
		   }
		   catch(Exception e){}
		   finally {in.close();}
		 
		//����������� ���-�� ����� ��� ������
		int mingroups = (int)Math.ceil((double)l.get(0)/2);
		 
		//���������� �����
		 int[] arr = new int[l.size()-1];
		 
		 for (int i = 1; i<l.size(); i++){
			 arr[i-1] = l.get(i);			 
		 }
		 
			arr = sortArray(arr);		
			
			for (int i = 0; i < mingroups; i++)
			{			
				sum += Math.ceil((float)arr[i]/2);			
			}
			
			System.out.println(sum);
	}
	
	public  static int[]  sortArray(int[] a){
		
		for(int i=0; i<a.length-1; i++){
			for (int y=i+1; y <a.length; y++){
			if (a[i] > a[y]) {
				int tmp = a[i];
				a[i] = a[y];
				a[y] = tmp;				
			}
			}
		}

		return a;
	}

}