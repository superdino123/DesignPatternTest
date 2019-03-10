package FactoryPattern.AbstractFactory;

public class GeliFactory implements IApplianceAbstractFactory {

	@Override
	public Condition newCondition() {
		// TODO 自动生成的方法存根
		return new GeliCondition();
	}

	@Override
	public Fridge newFridge() {
		// TODO 自动生成的方法存根
		return new GeliFridge();
	}

	@Override
	public TV newTV() {
		// TODO 自动生成的方法存根
		return new GeliTV();
	}
}
