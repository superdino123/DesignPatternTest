package FactoryPattern.FactoryMethod;

import FactoryPattern.Dog;

public class DogFactoryMehtodTest {
	public static void main(String[] args) {
		DemuFactory demuF = new DemuFactory();
		Dog demu = demuF.newDog();
		demu.work();
		
		LabuladuoFactory LabuladuoF = new LabuladuoFactory();
		Dog labuladuo = LabuladuoF.newDog();
		labuladuo.work();
		
		XueqiaoFactory xueqiaoF = new XueqiaoFactory();
		Dog xueqiao = xueqiaoF.newDog();
		xueqiao.work();
	}
}
