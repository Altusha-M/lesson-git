package lesson5.students;

public interface Aimable {
	void aim();

	default String newMethod() {
		return "default string";
	}

}
