package FactoryPattern.FactoryMethod;

import FactoryPattern.*;

public class XueqiaoFactory implements IDogFactory {

	@Override
	public Dog newDog() {
		// TODO 自动生成的方法存根
		return new XueqiaoDog();
	}
}
