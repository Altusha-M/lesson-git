package lesson5;

public class Animal {

	protected String type;

	public void voice() {
		System.out.println("Я животное");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
