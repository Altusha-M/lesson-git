package lesson5.students;

public class Shooter {
	public static void main(String[] args) {
//		Weapon ak47 = new AutomaticRifle(30, "ak-47");
		Weapon ak47 = new AutomaticRifle();
		ak47.setAmmo(30);
		ak47.shoot();
		ak47.shoot();
		ak47.shoot();
		ak47.shoot();
		ak47.shoot();

		((Reloadable) ak47).reload();

		System.out.println(ak47.getAmmo());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
