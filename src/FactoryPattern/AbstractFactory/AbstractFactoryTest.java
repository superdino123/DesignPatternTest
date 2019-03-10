package FactoryPattern.AbstractFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		HaierFactory factory = new HaierFactory();
		factory.newCondition().work();
		factory.newFridge().work();
		factory.newTV().work();
	}
}
