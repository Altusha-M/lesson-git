package lesson3;

import java.util.Scanner;

// 2. Напишите программу, выводящую сумму чисел от 1 до n,
// n - вводим с клавиатуры
public class Summator {
	public static void main(String[] notArgs) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
	}
}
