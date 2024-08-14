package edu.examples.less04.linerapp;

public class Task01 {

	public static void main(String[] args) {
		
//		1. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

		
		double a = 1.0;
		double b = 2.0;
		double c = 3.0;

		
		double numerator = b + Math.sqrt(Math.pow(b, 2)) + 4 * a * c; 
		double denominator = 2 * a; 
		double fraction = numerator / denominator; 

		double term2 = Math.pow(a, 3) * c + Math.pow(b, -2); 

		
		double result = fraction - term2;

		
		System.out.println("Результат вычисления: " + result);
	}

}
