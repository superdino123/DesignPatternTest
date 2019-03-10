package FactoryPattern.AbstractFactory;

public class MeidiFactory implements IApplianceAbstractFactory {

	@Override
	public Condition newCondition() {
		// TODO 自动生成的方法存根
		return new MeidiCondition();
	}

	@Override
	public Fridge newFridge() {
		// TODO 自动生成的方法存根
		return new MeidiFridge();
	}

	@Override
	public TV newTV() {
		// TODO 自动生成的方法存根
		return new MeidiTV();
	}
}
