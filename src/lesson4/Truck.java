package lesson4;


public class Truck extends Automobile {

	public void method() {
		System.out.println("abc");
	}

	@Override
	public void increaseSpeed() {
		setMaxSpeed(getMaxSpeed() + 11);
	}

}
