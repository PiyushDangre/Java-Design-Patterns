package abstractfactorypattern;

public class FactoryCreator {

	public static AbstractFactory getFactory(String factoryName) {
		
		switch(factoryName.toLowerCase()) {
		case "human" :
			return new HumanFactory();
		case "wildanimal" :
			return new WildAnimalFactory() ;
		default:
			return null ;
		
		}
		
	}
	
}
