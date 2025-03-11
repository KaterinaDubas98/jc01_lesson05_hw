package com.edu.home05.start;

public class Branch10 {

	public static void main(String[] args) {
		
		double r1;
		double r2;
		double s1;
		double s2;
		
		r1 = 4;
		r2 = 4;
		
		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);
		
		System.out.println("Даны два круга с радиусами " + r1 + " и " + r2);
		
		if (s1 > s2) {
			System.out.println("Площадь круга с радиусом " + r1 + " больше и равна " + s1);
		} else if (s2 > s1) {
			System.out.println("Площадь круга с радиусом " + r2 + " больше и равна " + s2);
		} else {
			System.out.println("Круги равны");
		}

	}

}
