package abstractfactorypattern;

public abstract class AbstractFactory {
	
	public abstract Human getHuman(String humanType);
	public abstract WildAnimal getWildAnimal(String animaltype);
	
}
