package edu.examples.less04.linerapp;

public class Task08 {

	public static void main(String[] args) {

//		8. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих
//		чисел.

		double a = 3;
		double b = -4;

		double arithmeticMeanOfCubes = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;

		double geometricMeanOfAbsoluteValues = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Среднее арифметическое кубов: " + arithmeticMeanOfCubes);
		System.out.println("Среднее геометрическое модулей:" + geometricMeanOfAbsoluteValues);
	}
}
