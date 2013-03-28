package creational.abstracts.factory.pattern;

public class Wonderland {
	public Wonderland(AnimalFactory factory) {
		Animal animal = factory.createAnimal();
		animal.breathe();
	}
}