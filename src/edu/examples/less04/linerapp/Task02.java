package edu.examples.less04.linerapp;

public class Task02 {

	public static void main(String[] args) {
		
//		2. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
		
		double a = 3.0;
		double b = 4.0;

		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		
		double area = 0.5 * a * b;

		
		double perimeter = a + b + c;

		
		System.out.println("Гипотенуза: " + c);
		System.out.println("Площадь: " + area);
		System.out.println("Периметр: " + perimeter);
	}

}
