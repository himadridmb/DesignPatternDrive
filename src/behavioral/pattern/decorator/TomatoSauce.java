package behavioral.pattern.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza);
		System.out.println("Adding TomatoSauce");
	}

	@Override
	public String getDescription() {
		return tempPizza.getDescription()+", TomatoSauce";
	}

	@Override
	public double getCost() {
		return tempPizza.getCost() + .50;
	}
}
