package abstracts.factory.pattern;

public class DesertFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Snake();
	}

}
