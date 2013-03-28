package creational.abstracts.factory.pattern;

public class SeaFactory implements AnimalFactory {

	public Animal createAnimal() {
		return new Shark();
	}

}