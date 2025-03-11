package com.edu.home05.start;

import java.util.Scanner;

public class Cycle06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите целое число: ");
		
		int a = 1;
		int b = 0;
		int c = sc.nextInt();
		
		while (a <= c) {
			b += a;
			a += 1;
		}
		
		System.out.print("Сумма чисел в диапазоне от 1 до " + c + " равна " + b);
		
		sc.close();
	}

}
