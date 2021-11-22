package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LessonDemo {

	public static void main(String[] args) {
		List<Integer> example = new ArrayList();
		List<String> exampleLink = new LinkedList();

		example.add(1);
		example.add(2);
		example.add(3);

		exampleLink.add("d");

		printList(example);
		printList(exampleLink);

		printArrayList((ArrayList) example);
		printArrayList((ArrayList) exampleLink);
	}

	public static void printList(List listToPrint) {
		listToPrint.get(0);
		System.out.println(listToPrint);
	}

	public static void printArrayList(ArrayList arrayListToPrint) {
		System.out.println(arrayListToPrint);
	}

}
