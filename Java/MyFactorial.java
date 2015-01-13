/*
*  Определение 1.  n!!...! = n(n-k)(n-2k)...(n mod k), если n не делится на k; 
*  						   n!!...! = n(n-k)(n-2k)...k, если n делится на k 
*  	         				(знаков ! в обоих случаях k штук).
*	Определение 2. X mod Y — остаток от деления X на Y.
*	
*	Например, 10 mod 3 = 1; 3! = 3*2*1; 10!!! = 10*7*4*1.
*	
*	Мы по заданным n и k смогли вычислить значение выражения из определения 1. А вам слабо?
*
*	Исходные данные
*
*	В единственной строке сначала дано целое число n, 1 <= n <= 10, затем ровно один пробел, затем k восклицательных знаков,
*	 1 <= k <= 20.
*	 
*	Результат
*	Выведите одно число - n!!...!
*
*	Пример
*	исходные данные			результат
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
