package com.edu.home05.start;

public class Cycle05 {

	public static void main(String[] args) {
		 
		int a = 1;
		int b = 0;
		
		while (a <= 99) {
			b += a;
			a +=2;
		}
		
		System.out.print("Сумма всех нечётных чисел в диапазоне от 1 до 99 = " + b);

	}

}
