package behavioral.pattern.decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Mozzarella");
	}

	@Override
	public String getDescription() {
		return tempPizza.getDescription()+", Mozzarella";
	}

	@Override
	public double getCost() {
		return tempPizza.getCost() + .50;
	}
}
