package com.edu.home05.start;

public class Branch08 {

public static void main(String[] args) {
	
	int a;
	int b;
	int a2;
	int b2;
	
	a = 7;
	b = 4;
	a2 = a * a;
	b2 = b * b;
		
	System.out.println("Даны два числа: a = " + a + " и b = " + b);
	
	if (a2 > b2) {
		
		System.out.println("Наименьший квадрат из двух чисел = " + b2);
		
	} else {
		System.out.println("Наименьший квадрат из двух чисел = " + a2);
	}

	}
	
}
