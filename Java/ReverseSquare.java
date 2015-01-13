import java.math.*;
import java.util.*;

 /*  Исходные данные
		Входной поток содержит набор целых чисел Ai (0 <= Ai <= 10^18), отделённых друг от друга 
		произвольным количеством пробелов и переводов строк. Размер входного потока не 
		превышает 256 КБ.
	Результат
		Для каждого числа Ai, начиная с последнего и заканчивая первым, в отдельной строке 
		вывести его квадратный корень не менее чем с четырьмя знаками после десятичной точки.
Пример

---Исх. Данные --------------------
 1427  0   

   876652098643267843 
5276538
  
   
--- Результат ------------------------
2297.0716
936297014.1164
0.0000
37.7757
		
		
*/


public class ReverseSquare {
		
   public static void main(String[] args) throws Exception {
       
	   Scanner in = new Scanner(System.in);
	   List<Long> l = new ArrayList<Long>();
	   
	   try{
	      	while (in.hasNext()) {
	       		l.add(in.nextLong());
	       	}
	   }
	   catch(Exception e){}
	   finally {in.close();}
	                
	   for (int i = l.size() - 1; i >= 0; i--) {
	      Long lng = l.get(i);	        	
	      BigDecimal bigDecimal = new BigDecimal(Math.sqrt(lng));
	      bigDecimal = bigDecimal.setScale(4, BigDecimal.ROUND_HALF_UP);
	      System.out.println(bigDecimal);
	    }
    }
}
				