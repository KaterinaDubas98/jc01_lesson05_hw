package com.edu.home05.start;

import java.util.Scanner;

public class Branch07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int x;
		double z;
		
		System.out.print("Введите 4 числа: ");
					
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введены некорректные значения, попробуйте снова");
		
		} 
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		
		z = Math.abs(a * x * x + b * x + c);
		System.out.println("Модуль формулы: " + z);
		
		
		sc.close();

	}

}
