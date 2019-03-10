package FactoryPattern.AbstractFactory;

public interface IApplianceAbstractFactory {
	public Condition newCondition();
	public Fridge newFridge();
	public TV newTV();
}
