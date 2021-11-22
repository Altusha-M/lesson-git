package lesson5.students;

public abstract class Weapon implements Reloadable, Aimable {

	protected int ammo;

	abstract public void point();

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public void shoot() {
		ammo--;
		System.out.println("paf");
	}

	@Override
	public void aim() {
		System.out.println("вы на мушке");
	}
}










