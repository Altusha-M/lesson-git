package lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lesson6 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();

		int n = 50_000;
		addElements(arrayList, n);
		addElements(linkedList, n);

		System.out.println("Array list");
		getElements(arrayList);
		System.out.println("Linked list");
		getElements(linkedList);

//		insertIntoLists(arrayList, linkedList);
//		insertIntoListsMiddle(arrayList, linkedList);
//		insertIntoListsHead(arrayList, linkedList);



	}

	// BigO-notation
	// О-нотация
	// O(1) - константное
	// O(log(n)) - логарифмическое
	// O(n) - линейное
	// O(n^2) - квадратичная (степенная)


	private static void getElements(List<String> list) {

		long startList = System.currentTimeMillis();

		for(int i = 0; i < 50_000; i++) {
			String s = list.get(i);
			String newString = s.toLowerCase();
		}

		System.out.println("get values from list from tail lasts: "
						   + (System.currentTimeMillis() - startList));
	}

	private static void addElements(List<String> list, int n) {
		for (int i = 0; i < n; i++) {
			String newElement = String.valueOf(new Random().nextDouble());
			list.add(newElement);
		}
	}

	private static void insertIntoLists(ArrayList<String> arrayList,
										LinkedList<String> linkedList) {
		long startArrayList = System.currentTimeMillis();
		for (int i = 0; i < 5_000_000; i++) {
			String newElement = String.valueOf(new Random().nextDouble());
			arrayList.add(newElement);
		}
		System.out.println("inserted into array list from tail lasts: "
						   + (System.currentTimeMillis() - startArrayList));

		long startLinkedList = System.currentTimeMillis();
		for (int i = 0; i < 5_000_000; i++) {
			String newElement = String.valueOf(new Random().nextDouble());
			linkedList.add(newElement);
		}
		System.out.println("inserted into linked list from tail lasts: "
						   + (System.currentTimeMillis() - startLinkedList));

	}

	private static void insertIntoListsMiddle(ArrayList<String> arrayList,
											  LinkedList<String> linkedList) {
		long startArrayListIntoMiddle = System.currentTimeMillis();
		for (int i = 0; i < 20_000; i++) {
			String newElement = String.valueOf(new Random().nextDouble());
			arrayList.add(arrayList.size() / 2, newElement);
		}
		System.out.println("inserted into array list from middle lasts: "
						   + (System.currentTimeMillis() - startArrayListIntoMiddle));

		long startLinkedListIntoMiddle = System.currentTimeMillis();
		for (int i = 0; i < 20_000; i++) {
			String newElement = String.valueOf(new Random().nextDouble());
			linkedList.add(linkedList.size() / 2, newElement);
		}
		System.out.println("inserted into linked list from middle lasts: "
						   + (System.currentTimeMillis() - startLinkedListIntoMiddle));

	}

	private static void insertIntoListsHead(ArrayList<String> arrayList,
											  LinkedList<String> linkedList) {
		long startArrayListIntoMiddle = System.currentTimeMillis();
		for (int i = 0; i < 200_000; i++) {
			String newElement = String.valueOf(new Random().nextDouble());
			arrayList.add(0, newElement);
		}
		System.out.println("inserted into array list from head lasts: "
						   + (System.currentTimeMillis() - startArrayListIntoMiddle));

		long startLinkedListIntoMiddle = System.currentTimeMillis();
		for (int i = 0; i < 200_000; i++) {
			String newElement = String.valueOf(new Random().nextDouble());
			linkedList.addFirst(newElement);
		}
		System.out.println("inserted into linked list from head lasts: "
						   + (System.currentTimeMillis() - startLinkedListIntoMiddle));

	}
}
