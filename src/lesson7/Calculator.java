package lesson7;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		MathParser mathParser = new MathParser();
		int result = mathParser.calculate(input);

		System.out.println(result);
	}

}

/*
1. Парсит простые математические выражения;
2. Проверяет корректность введенного выражения;
3. Предлагает ввести значение всех переменных, которые присутствуют в выражение;
4. Вычисляет результат выражения;
* корректно распознаёт пробелы;
* умеет распозновать вложенные (скобочные) выражения;
* умеет распознавать несколько систем счисления;
* умеет распознавать вещественные числа;

 */
