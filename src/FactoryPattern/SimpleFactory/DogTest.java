package FactoryPattern.SimpleFactory;

import FactoryPattern.*;

public class DogTest {
	public static void main(String[] args) {
		//原有创建方式
		/*Dog demu = new DemuDog(true, 1);
		Dog labuladuo = new LabuladuoDog(false, 3);
		Dog xueqiao = new XueqiaoDog(false, 4);
		demu.work();
		labuladuo.work();
		xueqiao.work();*/
		//简单工厂创建方式
		Dog demu = DogFactory.NewDog("demu");
		Dog labuladuo = DogFactory.NewDog("labuladuo");
		Dog xueqiao = DogFactory.NewDog("xueqiao");
		demu.work();
		labuladuo.work();
		xueqiao.work();
	}
}
