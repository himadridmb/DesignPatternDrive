package creational.abstracts.factory.pattern;

public class LandFactory implements AnimalFactory {
	public Animal createAnimal() {
		return new Elephant();
	}
}