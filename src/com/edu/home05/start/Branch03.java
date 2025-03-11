package com.edu.home05.start;

import java.util.Scanner;

public class Branch03 {

	public static void main(String[] args) {

		int a;
		int b = 3;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введиет число: ");

		a = sc.nextInt();

		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		sc.close();
	}

}
