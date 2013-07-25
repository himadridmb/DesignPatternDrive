package behavioral.pattern.visitor;

public class VisitorPatternDemo {

	/**
	 * The Visitor is known as a behavioral pattern, as it's used to manage algorithms, relationships and responsibilities between objects
	 * Allows for one or more operation to be applied to a set of objects at runtime, decoupling the operations from the object structure
	 */
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}


/*
	Shopping in the supermarket is another common example, where the shopping cart is your 
	set of elements. When you get to the checkout, the cashier acts as a visitor, taking the disparate 
	set of elements (your shopping), some with prices and others that need to be weighed, in order to provide you with a total. 
*/