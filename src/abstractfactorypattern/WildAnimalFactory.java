package abstractfactorypattern;

public class WildAnimalFactory extends AbstractFactory {

	@Override
	public Human getHuman(String humanType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WildAnimal getWildAnimal(String animalType) {

		switch (animalType.toLowerCase()) {

		case "vulture":
			return new Vulture();
		case "elephant":
			return new Elephant();
		default:
			return null;

		}

	}

}
