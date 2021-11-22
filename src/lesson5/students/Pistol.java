package lesson5.students;

public class Pistol extends Weapon implements Reloadable {

	String name;

	public Pistol() {
		name = "123";
	}

	public Pistol(int ammo) {
		this();
	}

	public Pistol(int ammo, String poof) {
		this(1);
		System.out.println(poof);
	}


	@Override
	public void reload() {
		System.out.println("Bullets left: " + ammo);
		ammo += 10;
	}

	@Override
	public void point() {

	}
}
