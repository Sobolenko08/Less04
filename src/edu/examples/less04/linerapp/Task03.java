package edu.examples.less04.linerapp;

public class Task03 {

	public static void main(String[] args) {
		
//		3. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
		
		double x1 = 1.0;
		double y1 = 2.0;
		double x2 = 4.0;
		double y2 = 6.0;

		
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		
		System.out.println("Расстояние между точками: " + distance);
	}

}
