package lesson3;

import java.util.Scanner;

public class Lesson3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		int first = scanner.nextInt();

//		String ternary = (first == 1) ? "Вы ввели 1" : "Вы ввели не 1";

//		System.out.println(ternary);

		boolean a = false;
		boolean b = true;

		// a() - возвращает true
		// b() - возвращает false
		if (a() && b()) {
			System.out.println("В ветке");
		}

		System.out.println();

		if (a() || b()) {
			System.out.println("В ветке");
		}

		System.out.println();

		if (b() && a()) {
			System.out.println("В ветке");
		}
		String i = a().toString();

		if (i != null && "a".equals(i)) {
			System.out.println("что-нибудь");
		}

		String abs = new String("abs");


		if("abs".equals(abs)) {
			System.out.println(abs == "abs");
		}

	}

	public static Boolean a() {
		System.out.println("Inside 'a' method");
		return true;
	}

	public static Boolean b(){
		System.out.println("Inside 'b' method");
		return false;
	}
}
