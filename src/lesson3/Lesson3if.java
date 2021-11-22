package lesson3;

import java.util.Scanner;

public class Lesson3if {

//	Условный оператор
// Пользователь вводит свой возраст;
// Проверка, есть ли пользователю 18 лет;
// Программа сообщает пользователю, надо ли ему уже съехать от родителей;
// Или уже надо просить внуков съехать жить отдельно...

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		int age = scanner.nextInt();


//		if (age < 18) {
//			System.out.println("Ты ещё маленький");
//		} else if (18 <= age && age < 60) {
//			System.out.println("Тебе пора съехать от родителей");
//		} else if (age >= 60) {
//			System.out.println("Попроси внуков съехать и жить отдельно");
//		}

		String code = scanner.nextLine();

		switch (code) {
			case "+":
				System.out.println(1 + 1);
				break;
			case "-":
				System.out.println(1 - 1);
				break;
			case "*":
				System.out.println(1 * 2);
				break;
			default:
				System.out.println("Операция не разспознана");
				break;
		}

		ExampleEnum exampleEnum = ExampleEnum.MY_ENUM;

		switch (exampleEnum) {
			case MY_ENUM:
				System.out.println("my enum");
			case MY_SECOND_ENUM:
				System.out.println("my second enum");
		}

	}

	private enum ExampleEnum {
		MY_ENUM, MY_SECOND_ENUM
	}

}
