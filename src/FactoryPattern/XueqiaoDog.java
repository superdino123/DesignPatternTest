package FactoryPattern;

public class XueqiaoDog extends Dog {
	public XueqiaoDog(boolean sex, int age) {
		super(sex, age);
	}
	public XueqiaoDog() {
		super();
	}
	public void work() {
		System.out.println("Xueqiao work");
	}
}