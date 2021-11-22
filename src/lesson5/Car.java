package lesson5;

public class Car implements Pleaseable {
	@Override
	public void doWhenPleasant() {
		System.out.println("би-бип");
	}

	@Override
	public String doSomethingElse() {
		return null;
	}
}
