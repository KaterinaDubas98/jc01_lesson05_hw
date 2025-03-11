package com.edu.home05.start;

import java.util.Scanner;

public class Branch09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите три целых числа:");

		int a;
		int b;
		int c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if ((a == b) && (b == c)) {
			System.out.println("Трегольник, состоящий из заданных сторон, равносторонний");
		} else {
			System.out.println("Треугольник, состоящий из заданных сторон, не равносторонний");
		}
		
		sc.close();

	}

}
