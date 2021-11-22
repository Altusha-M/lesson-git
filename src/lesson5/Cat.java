package lesson5;

public class Cat extends Animal implements Pleaseable {

	static int counter = 0;

	public Cat(String type) {
		this.type = type;
	}

	@Override
	public void doWhenPleasant() {
		System.out.println("Я мурлычу");
	}

	@Override
	public String doSomethingElse() {
		return "do nothing";
	}

	@Override
	public void voice() {
		System.out.println("Я " + type + " кошка");
	}

	public static Cat getInstance(String type) {
		if (counter >= 5) {
			System.out.println("Слишком много кошек");
			throw new RuntimeException("too much cats");
		} else {
			return new Cat(type);
		}
	}

}
