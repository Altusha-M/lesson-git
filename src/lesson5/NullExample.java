package lesson5;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NullExample {

	public static void main(String[] args) {
		NullOrNotNull n = new NullOrNotNull();
		System.out.println(n.i);
		System.out.println(n.s);
		System.out.println(n.o);
		n.i++;
		System.out.println(n.i);

		n.s = "      ,as;dflkja;hsdfj,asd;fljas;df,    ";
		System.out.println("наша строка ДО изменения " + n.s);
		String replaced = n.s.replace(";", "!!!");
		System.out.println("наша строка ПОСЛЕ изменения " + n.s);
		System.out.println("не наша строка " + replaced);
		String[] splitted = n.s.split(",");
		System.out.println(Arrays.toString(splitted));
		n.s.toCharArray();
		System.out.println(n.s.contains("flk"));
		System.out.println(n.s.charAt(4));
		String trimmed = n.s.trim();
		System.out.println(trimmed);
		System.out.println("СраВниваеМая Строка".equals("сравниваемая строка"));


		List<String> demoList = new ArrayList<>();
		List<String> demoLList = new LinkedList<>();


		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();

		arrayList.add("string1");
		linkedList.add("string12");
//		0  1  2  3  4  5  6  7
//		[] [] [] [] [] [] [] []
//
//		0  1  2  3  4  5  6  7  8
//		[] [] [] [] [] [] [] [] []
//
//		0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16
//		[] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] []

//		[]<->[]<->[]<->[]<->[]<->[]<->[]<->[]<->[]<->[]<->[]





	}

	static class NullOrNotNull {
		int i;
		String s = "";
		Object o = new Object();
	}

}
