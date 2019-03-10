package FactoryPattern;

public class DemuDog extends Dog {
	public DemuDog(boolean sex, int age) {
		super(sex, age);
	}
	public DemuDog() {
		super();
	}
	public void work() {
		//Demu work
		System.out.println("Demu work");
	}
}
