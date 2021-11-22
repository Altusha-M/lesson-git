package lesson3;

// 1. Составьте программу, выводящую на экран квадраты чисел от 10 до 20.
public class SquareRoots {

	public static void main(String[] notArgs) {
		for(int i = 10; i <= 20; i++) {
			System.out.println(i * i);
			System.out.println(Math.pow(i, 3));
		}
	}

}
