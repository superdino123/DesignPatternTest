package FactoryPattern.AbstractFactory;

public class EveryBrandAppliance {
}

class MeidiCondition extends Condition {
	public void work() {
		System.out.println("美的空调工作");
	}
}

class HaierCondition extends Condition {
	public void work() {
		System.out.println("海尔空调工作");
	}
}

class GeliCondition extends Condition {
	public void work() {
		System.out.println("格力空调工作");
	}
}

class MeidiFridge extends Fridge {
	public void work() {
		System.out.println("美的冰箱工作");
	}
}

class HaierFridge extends Fridge {
	public void work() {
		System.out.println("海尔冰箱工作");
	}
}

class GeliFridge extends Fridge {
	public void work() {
		System.out.println("格力冰箱工作");
	}
}

class MeidiTV extends TV {
	public void work() {
		System.out.println("美的电视工作");
	}
}

class HaierTV extends TV {
	public void work() {
		System.out.println("海尔电视工作");
	}
}

class GeliTV extends TV {
	public void work() {
		System.out.println("格力电视工作");
	}
}
