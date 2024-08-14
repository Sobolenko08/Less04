package edu.examples.less04.linerapp;

public class Task11 {

	public static void main(String[] args) {

//		11. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

		double a = 100;

		double area = Math.pow(a, 2) / (4 * Math.PI);

		System.out.printf("Площадь круга: %.2f%n", area);
	}

}
