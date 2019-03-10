package FactoryPattern.FactoryMethod;

import FactoryPattern.DemuDog;
import FactoryPattern.Dog;

public class DemuFactory implements IDogFactory {

	@Override
	public Dog newDog() {
		// TODO 自动生成的方法存根
		return new DemuDog();
	}

}
