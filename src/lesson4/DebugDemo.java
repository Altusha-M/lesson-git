package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class DebugDemo {

	static int demoClassInteger;

	static String example;


	public static void main(String[] args) {
//		String exampleString = "пример";
//		System.out.println("Строка");
//		System.out.println(exampleString);
//		exampleString = "упс, поменяли";
//		System.out.println(exampleString);
//
//		exampleString = exampleString + 123;

//		int i = 1;

//		myMethod();

//		print();
//		print("Другая строка", " новый кусок", 3);
//		print("Эники беники", " ели вареники", 10);
//		String methodResult = privateExample();
//		System.out.println("что-нибудь другое");
//		System.out.println(methodResult);

//		System.out.println(i);
//		i = demoInt(i);
//		System.out.println(i);

//		for (String arg : args) {
//			System.out.println(arg);
//		}

//		demoInt(i);
//		System.out.println(Arrays.toString(args));
//		System.out.println(args);

//		System.out.println(demoClassInteger);

//		int i;
//		System.out.println(example);
//		System.out.println(i);

		Automobile automobile = new Automobile();


		System.out.println(automobile);
		System.out.println(automobile.getMaxSpeed());
		System.out.println(automobile.name);
		automobile.increaseSpeed();
		System.out.println(automobile.getMaxSpeed());
		automobile.increaseSpeed();
		System.out.println(automobile.getMaxSpeed());

		Automobile newAuto = new Automobile();

		System.out.println(newAuto.getMaxSpeed());

		System.out.println(Automobile.length);
		System.out.println(Automobile.length);

		Automobile.crash();

//		System.out.println(Automobile.length);
//		System.out.println(Automobile.length);

//		newAuto.crashAgain();

//		System.out.println(automobile.length);
//		System.out.println(newAuto.length);

		System.out.println("------------");

		Automobile autoTruck = new Truck();
		Truck truck = new Truck();

		autoTruck.increaseSpeed();
		System.out.println(autoTruck.getMaxSpeed());
		truck.increaseSpeed();
		System.out.println(truck.getMaxSpeed());
//		autoTruck.method();


//		final int maxSpeed = truck.getMaxSpeed();

//		Truck.crash();

	}

	static int demoInt(long i) {
		System.out.println(i++);
		System.out.println(i++);
		return (int) i;
	}

	public static void myMethod() {
		Scanner scan = new Scanner(System.in);

		final String scannedString = scan.nextLine();

		System.out.println(scannedString);
		if ("stop".equals(scannedString)) {
			System.out.println("равны");
		} else {
			System.out.println("не равны");
		}
	}

	static void print(String s, String newString, int j) {
		for (int i = 0; i < j; i++) {
			System.out.println(s + newString);
			if (i == 2) {
				return;
			}
		}
	}


	static void print(String str, int j, String newString) {
		for (int i = 0; i < j; i++) {
			System.out.println(str + newString);
			if (i == 2) {
				return;
			}
		}
	}

	static void print() {
		System.out.println("ssss");
	}

	static void newMethod() {
		System.out.println("new method");
		return;
	}

	static String privateExample() {
		System.out.println("вывод строки");
		return "какая-нибудь строка";
	}

	// сигнатура метода имя + аргументы
//
}
