package behavioral.pattern.decorator;

public class PizzaMaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pizza pizza = new PlainPizza();
		pizza = new TomatoSauce(pizza);
		pizza = new Mozzarella(pizza);
		pizza = new Mozzarella(pizza);
		
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}

}
