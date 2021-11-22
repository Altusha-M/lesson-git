package lesson3;

public class ArraysExample {

	public static void main(String[] args) {
//		int[] array = new int[10];
		int[] array1 = {1, 2, 3, 5, 0, -123, 123, -1233};

		int i;
		int min = array1[0];
		int minIndex = 0;
		for (i = 0; i < array1.length; i++) {
			if (min >= array1[i]) {
				min = array1[i];
				minIndex = i;
			}
		}

		for (int n : array1) {
			if (min >= n) {
				min = n;
			}
		}

		System.out.println("min " + min + " min index " + minIndex);


		System.out.println("finish");
		// найти и вывести минимальное число в массиве array1 и его индекс


	}
}
