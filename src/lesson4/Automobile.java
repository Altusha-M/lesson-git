package lesson4;

public class Automobile {

	private int maxSpeed = 120;
	String name = "Opel";
	static int length = 4;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}

	@Override
	public String toString() {
		return "max speed " + maxSpeed
				+ " name " + name;
	}

	public void increaseSpeed() {
		maxSpeed = maxSpeed + 10;
	}

	public String showName1() {
		return name;
	}

	public static void crash() {
		length--;
	}

	public void crashAgain() {
		length--;
	}

}
