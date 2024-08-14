package edu.examples.less04.linerapp;

public class Task09 {

	public static void main(String[] args) {

//		9. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

		double a = 5;

		double areaOfFace = Math.pow(a, 2);

		double surfaceArea = 6 * areaOfFace;

		double volume = Math.pow(a, 3);

		System.out.printf("Площадь грани: %.2f%n", areaOfFace);
		System.out.printf("Площадь полной поверхности: %.2f%n", surfaceArea);
		System.out.printf("Объем куба: %.2f%n", volume);
	}

}
