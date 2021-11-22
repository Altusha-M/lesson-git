package lesson3;

import java.util.Scanner;

public class Lesson3Loops {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();

		System.out.println(i * i * i * i * i);

		int sum = 1;

		for (int j = 5; j > 0; j--) {
			sum = sum * i;
		}

		int a = 0;
		while (++a < 5) {
			System.out.println("2");
		}
		int code = 0;

		do {
			code = scanner.nextInt();
			System.out.println("dowhile");
		} while (code != 0);

		while (code != 0) {
			code = scanner.nextInt();
			System.out.println("while");
		}

		System.out.println(sum);

	}

}
