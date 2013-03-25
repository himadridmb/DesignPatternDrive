package abstracts.factory.pattern;

/* Abstract Factory Design Pattern is another flavor of Factory Design Pattern. This pattern can be considered as a super factory or Factory of factories.
 * 
 * Abstract Factory Design Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 */

public class SampleAbstractFactory {

	public static void main(String args[]) {
		new Wonderland(createAnimalFactory("desert"));
	}

	public static AnimalFactory createAnimalFactory(String type) {
		if ("water".equals(type))
			return new SeaFactory();
		else if ("desert".equals(type))
			return new DesertFactory();
		else
			return new LandFactory();
	}
}

/* Advantages:
		Use of this pattern makes it possible to interchange the concrete classes without changing the client code even at runtime.
	Disadvantages:
		One of the main drawbacks is the extra complexity and writing the code during the initial stages.
*/