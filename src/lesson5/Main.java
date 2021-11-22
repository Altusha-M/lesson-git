package lesson5;

import lesson5.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main (String[] args) {
//		Cat simpleCat = Cat.getInstance();
//		Cat simpleCat1 = Cat.getInstance();
//		Cat simpleCat2 = Cat.getInstance();
//		Cat simpleCat3 = Cat.getInstance();
//		Cat simpleCat4 = Cat.getInstance();
//		Cat simpleCat5 = Cat.getInstance();

		Animal newCat = new Cat("персидская");
		Animal anotherCat = new Cat("уличная");

//		newCat.voice();
//		anotherCat.voice();

		Dog simpleDog = new Dog();
//		simpleDog.voice();

		Mouse simpleMouse = new Mouse();


		List<Animal> animals = new ArrayList<>();

		animals.add(newCat);
		animals.add(anotherCat);
		animals.add(simpleDog);
		animals.add(simpleMouse);

//		for (Animal animal : animals) {
//			animal.voice();
//			Pleaseable pleaseableAnimal = (Pleaseable) animal;
//
//			((Pleaseable) animal).doWhenPleasant();
//
//			pleaseableAnimal.doWhenPleasant();
//		}
//
//

		List<Pleaseable> pleaseables = new ArrayList<>();

		Pleaseable[] pleaseables1 = new Pleaseable[3];

		Pleaseable superNewCat = new Cat("супер-кошка");

		Pleaseable car = new Car();

		pleaseables.add(superNewCat);
		pleaseables.add(car);

		for (Pleaseable pleaseable : pleaseables) {
			pleaseable.doWhenPleasant();

			((Animal) pleaseable).voice();
		}

		int x = (1 + 2);
	}

}
