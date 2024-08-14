package edu.examples.less04.linerapp;

public class Task06 {

	public static void main(String[] args) {
		
//		6. Написать программу, которая выводит на экран первые четыре степени числа π.
		
		double pi = Math.PI;

		
		for (int i = 1; i <= 4; i++) {
			double power = Math.pow(pi, i);
			System.out.println("Pi в степени " + i + " равно " + power);
		}
	}
}
