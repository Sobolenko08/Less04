package edu.examples.less04.linerapp;

public class Task04 {

	public static void main(String[] args) {

//		4. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2),(х3, у3). Найти его периметр и площадь.
		
		double x1 = 1.0, y1 = 2.0;
		double x2 = 4.0, y2 = 6.0;
		double x3 = 5.0, y3 = 1.0;

		
		double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double CA = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

		
		double perimeter = AB + BC + CA;

		
		double p = perimeter / 2;

		
		double area = Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));

		
		System.out.println("Периметр треугольника: " + perimeter);
		System.out.println("Площадь треугольника: " + area);
	}

}
