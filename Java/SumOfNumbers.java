

/*
Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.
Исходные данные
В единственной строке расположено число N, по модулю не превосходящее 10000.
Результат
Выведите целое число — ответ задачи.

Пример
-- Исх. Данные ---
-3

-- Результат ---	
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
