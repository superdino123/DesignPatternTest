package FactoryPattern.AbstractFactory;

public class HaierFactory implements IApplianceAbstractFactory {

	@Override
	public Condition newCondition() {
		// TODO 自动生成的方法存根
		return new HaierCondition();
	}

	@Override
	public Fridge newFridge() {
		// TODO 自动生成的方法存根
		return new HaierFridge();
	}

	@Override
	public TV newTV() {
		// TODO 自动生成的方法存根
		return new HaierTV();
	}

}
