package programs;

import java.util.Scanner;

public class SuperKeyword {
	public void eat() {
		System.out.println("eating...");
	}
}

class Dog extends SuperKeyword {
	public void eat() {
		System.out.println("eating bread...");
	}

	public void bark() {
		System.out.println("barking...");
	}

	public void work() {
		super.eat();
		//bark();
	}
}

class TestSuper2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.work();
	}
}