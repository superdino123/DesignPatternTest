package FactoryPattern;

public class LabuladuoDog extends Dog {
	public LabuladuoDog(boolean sex, int age) {
		super(sex, age);
	}
	public LabuladuoDog() {
		super();
	}
	public void work() {
		System.out.println("Labuladuo work");
	}
}