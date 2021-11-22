package lesson5;

public class RecursionDemo {

	public static void main(String[] args) {
		new RecursionDemo().recursive(2);

		StringBuilder sb = new StringBuilder("abc");
		System.out.println("asd" + "zcxv");
		sb.append("bcd");
		sb.append("efg");
		sb.append("hij");
		final String s = sb.toString();

		final int[] array = {1, 2, 3, 4};

		array[1] = 123;


		System.out.println(s);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}


	void recursive(int i) {
		i++;
		i++;
		if (i > 100) {
			return;
		}
		System.out.println(i);
		recursive(i);
	}
}
