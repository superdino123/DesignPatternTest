package FactoryPattern.FactoryMethod;

import FactoryPattern.*;

public class LabuladuoFactory implements IDogFactory {

	@Override
	public Dog newDog() {
		// TODO 自动生成的方法存根
		return new LabuladuoDog();
	}

}