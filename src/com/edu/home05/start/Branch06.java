package com.edu.home05.start;

import java.util.Scanner;

public class Branch06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Введите число a: ");
		a = sc.nextInt();
		
		System.out.print("Введите число b: ");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println("Наибольшее из двух введённых чисел - " + a);
		}else if (b > a) {
			System.out.println("Наибольшее из двух введённых чисел - " + b);
		} else {
			System.out.println("Введённые числа равны, повторите попытку");
		}
		
		sc.close();

	}

}
