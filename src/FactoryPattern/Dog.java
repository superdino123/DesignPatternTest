package FactoryPattern;

public class Dog {
	private boolean sex;
	private int age;
	
	public Dog() {}
	public Dog(boolean sex, int age) {
		this.sex = sex;
		this.age = age;
	}
	
	public boolean getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	
	public void call() {
		
	}
	public void work() {
		
	}
}
