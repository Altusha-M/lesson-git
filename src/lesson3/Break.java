package lesson3;

public class Break {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("finish 1");

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("finish 2");

		for (int i = 0; i < 20; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("finish 3");

	}
}
