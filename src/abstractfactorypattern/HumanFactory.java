package abstractfactorypattern;

public class HumanFactory extends AbstractFactory {

	@Override
	public Human getHuman(String humanType) {
		
		switch(humanType.toLowerCase()) {
		
		case "child" :
			
			return new Child();
			
		case "adult" :
			
			return new Adult();
			
		default : 
			
			return null ;
		}
		
	}

	@Override
	public WildAnimal getWildAnimal(String animalType) {
		// TODO Auto-generated method stub
		return null;
	}

}
