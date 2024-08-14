package edu.examples.less04.linerapp;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

//		7. Найти произведение цифр заданного четырехзначного числа.1

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите четырехзначное число: ");
		int number = scanner.nextInt();

		
		if (number < 1000 || number > 9999) {
			System.out.println("Ошибка: число должно быть четырехзначным.");
			return;
		}

		int digit1 = number / 1000; // Первая цифра
		int digit2 = (number / 100) % 10; // Вторая цифра
		int digit3 = (number / 10) % 10; // Третья цифра
		int digit4 = number % 10; // Четвертая цифра

		int product = digit1 * digit2 * digit3 * digit4;

		System.out.println("Произведение цифр числа: " + product);

	}

}
