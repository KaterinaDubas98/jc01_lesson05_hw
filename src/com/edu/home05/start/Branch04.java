package com.edu.home05.start;

import java.util.Scanner;

public class Branch04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Введите число a: ");
		a = sc.nextInt();
		
		System.out.print("Введите число b: ");
		b = sc.nextInt();

		if (a == b) {
			System.out.println("Введённые числа равны");
		} else {
			System.out.println("Введённые числа не равны");
		}
		
		sc.close();
	}

}
