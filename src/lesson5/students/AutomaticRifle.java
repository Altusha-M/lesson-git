package lesson5.students;

public class AutomaticRifle extends Weapon {

	public String name;

	@Override
	public void point() {
		System.out.println("");
	}

	@Override
	public void shoot() {
		for(int i = 0; i < 3; i++) {
			super.shoot();
		}
	}


	@Override
	public void reload() {
		System.out.println("Bullets left: " + ammo);
		ammo += 30;
	}
}
