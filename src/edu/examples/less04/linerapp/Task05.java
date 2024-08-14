package edu.examples.less04.linerapp;

public class Task05 {

	public static void main(String[] args) {

//		5. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

		double R = 5.0;

		
		double pi = Math.PI;

		
		double circumference = 2 * pi * R;

		
		double area = pi * Math.pow(R, 2);

		
		System.out.println("Длина окружности: " + circumference);
		System.out.println("Площадь круга: " + area);
	}

}
