package FactoryPattern.SimpleFactory;

import FactoryPattern.*;

public class DogFactory {
	public static Dog NewDog(String dogType) {
		Dog dog = null;
		switch(dogType) {
			case "demu":
				dog = new DemuDog();
				break;
			case "labuladuo":
				dog = new LabuladuoDog();
				break;
			case "xueqiao":
				dog = new XueqiaoDog();
				break;
		}
		return dog;
	}
}
