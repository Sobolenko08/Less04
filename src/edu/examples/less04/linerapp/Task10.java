package edu.examples.less04.linerapp;

public class Task10 {

	public static void main(String[] args) {

//		10. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы
//		вписанной и описанной окружностей.

		double a = 6;

		double area = (Math.sqrt(3) / 4) * Math.pow(a, 2);

		double height = (Math.sqrt(3) / 2) * a;

		double radiusInCircle = (a * Math.sqrt(3)) / 6;

		double radiusOutCircle = a / Math.sqrt(3);

		System.out.printf("Площадь треугольника: %.2f%n", area);
		System.out.printf("Высота треугольника: %.2f%n", height);
		System.out.printf("Радиус вписанной окружности: %.2f%n", radiusInCircle);
		System.out.printf("Радиус описанной окружности: %.2f%n", radiusOutCircle);
	}

}
