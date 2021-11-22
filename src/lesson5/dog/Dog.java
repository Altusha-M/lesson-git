package lesson5.dog;

import lesson5.Animal;
import lesson5.Pleaseable;

public class Dog extends Animal implements Pleaseable {

	@Override
	public void doWhenPleasant(){
		System.out.println("я виляю хвостом");
	}

	@Override
	public String doSomethingElse() {
		System.out.println("olololo");
		return "else";
	}

}
