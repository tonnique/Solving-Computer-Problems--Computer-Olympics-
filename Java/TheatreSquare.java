/*
 * “еатральна€ площадь в столице Ѕерл€ндии представл€ет собой пр€моугольник n *m  метров .
 *  ѕо случаю очередного юбиле€ города, было прин€то решение о замощении площади квадратными 
 *  гранитными плитами.  ажда€ плита имеет размер a *a.

 акое наименьшее количество плит понадобитс€ дл€ замощени€ площади? –азрешено покрыть плитами
 большую поверхность, чем театральна€ площадь, но она должна быть покрыта об€зательно. √ранитные 
 плиты нельз€ ломать или дробить, а разрешено использовать только целиком. √раницы плит должны быть 
 параллельны границам площади.
 
¬ходные данные

¬ первой строке записано три целых натуральных числа n, m и a (1 <= n, m, a <= 109).
¬ыходные данные

¬ыведите искомое количество плит.

ѕримеры тестов

¬ходные данные
6 6 4

¬ыходные данные
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

